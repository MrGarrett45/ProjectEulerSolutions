/**
 * Created by Garrett on 12/28/2016.
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */
public class problem7
{
    public static void main(String args[])
    {
        int counter = 0;
        for(int z = 0; z < 999999999; z++)
        {
            if(isPrime(z))
            {
                counter++;
                System.out.println(z+" "+counter);
            }
        }
    }

    public static boolean isPrime(int x)
    {
        boolean returnVal = true;

        if(x != 1 && x != 0)
        {
            for(int i = 2 ; i <= (x / 2) ; i++)
            {
                if(x % i == 0)
                {
                    returnVal = false;
                }
            }
        }
        else
        {
            returnVal = false;
        }

        return returnVal;
    }
}

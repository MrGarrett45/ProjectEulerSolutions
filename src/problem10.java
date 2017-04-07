/**
 * Created by Garrett on 12/28/2016.
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.
 */
public class problem10
{
    public static void main(String args[])
    {
        int total = 0;
        for(int i = 2; i < 2000001; i ++)
        {
            if(isPrime(i))
            {
                total += i;
                System.out.println(i);
            }
        }

        System.out.println(total);
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

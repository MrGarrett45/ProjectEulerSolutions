/**
 * Created by Garrett on 12/28/2016.
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 */
public class problem10pt2
{
    public static void main(String args[])
    {
        int total = 0;
        int i = 2;
        while(i < 2000001)
        {
            if(i % 2 != 0)
            {
                if(isPrime(i))
                {
                    total +=  i;
                    System.out.println(i);
                }
            }

            i++;
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

/* MUCH better implementation using Sieve of Eratosthenes found in solution thread
public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int n =2000000;
        Boolean[] isPrime = new Boolean[n];

        for(int i =0; i < n; i++){
            isPrime[i] = true;
        }

        for(int i =2; i < (int)Math.sqrt(n)+1;i++){
            if(isPrime[i]){

                for(int j =2; j*i <n; j++){
                    isPrime[i*j] =false;
                }
            }
        }

        long sum =0;
        for(int i =2; i <n;i++){

            if(isPrime[i]){
                sum+=i;

            }
        }
        System.out.println(sum);

        long end = System.currentTimeMillis();
        long duration = end -start;
        System.out.println(duration);
    }
 */
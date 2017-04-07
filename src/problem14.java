/**
 * Created by Garrett on 12/29/2016.
 The following iterative sequence is defined for the set of positive integers:

 n → n/2 (n is even)
 n → 3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:

 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

 Which starting number, under one million, produces the longest chain?

 NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class problem14
{
    public static void main(String args[])
    {
        long starttime=System.nanoTime();
        long x = 0;
        long counter = 0;
        long total = 0;
        for(int i = 2; i <= 1000000;i++)
        {
            x = i;
            counter = 1;
            while(x != 1)
            {
                if(x % 2 == 0)
                {
                    x = x / 2;
                }
                else
                {
                    x = (x * 3)+1;
                }
                counter++;
            }

            if(counter > total)
            {
                total = counter;
                System.out.println(i+" "+counter);
            }
        }
        System.out.println("took " + (System.nanoTime()-starttime)*0.000000001 + " secs");
    }
}

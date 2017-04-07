/**
 * Created by Garrett on 12/28/2016.
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

 Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
 10: 1,2,5,10
 15: 1,3,5,15
 21: 1,3,7,21
 28: 1,2,4,7,14,28
 We can see that 28 is the first triangle number to have over five divisors.

 What is the value of the first triangle number to have over five hundred divisors?
 */

//Kind of a brute force solution, also should start using while(true) instead of i < 999999999 or 100000 or whatever
//Super easy way to generate triangleNums: tNum = tNum+(i+1);

public class problem12
{
    public static void main(String args[])
    {
        int triangleNum = 0;
        int factorCounter = 0;

        for(int i = 1; i < 100000; i++)
        {
            triangleNum = 0;
            for(int j = 0; j <= i;j++)
            {
                //System.out.println(j);
                triangleNum+=j;
            }
            //System.out.println(i+" "+triangleNum);

            factorCounter = 0;
            //System.out.println("Triangle Number: "+triangleNum);
            if(triangleNum % 2 == 0 && triangleNum % 3 == 0 && triangleNum % 4 == 0 && triangleNum % 10 == 0 && triangleNum > 73150560)
            {
                for(int z = 1;factorCounter <= 550; z++)
                {
                    if(z > ((triangleNum/2) + 1))
                    {
                        factorCounter = 551;
                    }

                    if(triangleNum % z == 0)
                    {
                        factorCounter++;
                        //System.out.println(z);
                        if(factorCounter == 300)
                        {
                            System.out.println("Hit 300: "+triangleNum);
                        }

                        if(factorCounter == 400)
                        {
                            System.out.println("Hit 400: "+triangleNum);
                        }

                        if(factorCounter == 500)
                        {
                            System.out.println("Answer: "+triangleNum);
                            break;
                        }
                    }
                }
            }
        }

    }
}
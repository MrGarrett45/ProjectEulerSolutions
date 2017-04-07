/**
 * Created by Garrett on 12/28/2016.
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a^2 + b^2 = c^2
 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */
public class problem9
{
    public static void main(String args[])
    {
        int total = 0;
        for(int a = 0; a < 1000; a++)
        {
            for(int b = 0; b < 1000; b++)
            {
                for(int c = 0; c < 1000; c++)
                {
                    if(isPythagoreanTriple(a, b, c))
                    {
                        total = a + b + c;
                        if(total == 1000)
                        {
                            System.out.println(a * b * c);
                        }

                        //System.out.println(a +" "+b+" "+c+" "+total);
                    }
                }
            }
        }
    }

    public static boolean isPythagoreanTriple(int a, int b, int c)
    {
        boolean returnVal = false;

        if((a*a) + (b*b) == (c*c) && a < b && b < c)
        {
            returnVal = true;
        }

        return returnVal;
    }
}

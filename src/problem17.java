/**
 * Created by Garrett on 12/29/2016.
 If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

 If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


 NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
public class problem17
{
    public static void main(String args[])
    {
        long startTime=System.nanoTime();

        int letterCounter = 0;
        for(int i = 1; i <= 5;i++)
        {
            String x = Integer.toString(i);

            if(x.length() == 1)
            {
                letterCounter+=length1(i);
            }

            if(x.length() == 2)
            {

            }

            if(x.length() == 3)
            {

            }

        }

        System.out.println(letterCounter);

        //String z = "42";
        //System.out.println(Character.getNumericValue(z.charAt(0)));
        
        System.out.println("took " + (System.nanoTime()-startTime)*0.000000001 + " secs");
    }

    public static int length1(int i)
    {
        int tempCounter = 0;
        if(i == 1 || i == 2 || i == 6)
        {
            tempCounter+=3;
        }

        if(i == 4 || i == 5 || i == 9)
        {
            tempCounter+=4;
        }

        if(i == 3 || i == 7 || i == 8)
        {
            tempCounter+=5;
        }

        return tempCounter;
    }
}

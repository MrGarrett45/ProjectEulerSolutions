/**
 * Created by Garrett on 12/27/2016.
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class problem5
{
    public static void main(String args[])
    {
        int flag;
        for(int i = 0; i < 999999999; i++)
        {
            flag = 0;
            for(int j = 1; j < 21; j++)
            {
                if(i % j == 0)
                {
                    flag++;
                }

                if(flag == 20)
                {
                    System.out.println(i);
                }
            }
        }
    }
}

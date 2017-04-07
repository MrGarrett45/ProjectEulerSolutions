/**
 * Created by Garrett on 12/29/2016.
 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 What is the sum of the digits of the number 2^1000?
 */
public class problem16
{
    public static void main(String args[])
    {
        String x = "107150963860718626732094842504906000181056140481175533607443750388370351051124936122493198378815695858127594672917553146825187145856923140435984577 574698574803934567774824230985421074605062371141877954182153064749835819 412673987675591655439460770629145711964776865421676604298316526243863720 5668069376";
        long total = 0;
        long temp = 0;

        for(int i = 0; i < x.length(); i++)
        {
            temp = Character.getNumericValue(x.charAt(i));
            //System.out.println(temp);

            total+=temp;
        }

        System.out.println(total);
    }
}

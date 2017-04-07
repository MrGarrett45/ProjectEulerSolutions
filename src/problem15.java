/**
 * Created by Garrett on 12/29/2016.
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


 How many such routes are there through a 20×20 grid?
 */

//the last entry in the last array is the answer
import java.util.Arrays;
public class problem15
{
    public static void main(String args[])
    {
        long startTime=System.nanoTime();


        int latticeSize = 20;

        long[][] lattice = new long[latticeSize + 1][latticeSize + 1];

        for(int i = 0;i <= latticeSize; i++)
        {
            for(int j = 0; j <= latticeSize;j++)
            {
                lattice[0][j] = 1;
                lattice[i][0] = 1;
            }
        }


        for(int i2 = 0;i2 <= latticeSize; i2++)
        {
            for(int j2 = 0; j2 <= latticeSize;j2++)
            {
                if(lattice[i2][j2] == 0)
                {
                    lattice[i2][j2] = lattice[i2-1][j2] + lattice[i2][j2 -1];
                }
            }
        }

        for(int i3 = 0;i3 <= latticeSize; i3++)
        {
            for(int j3 = 0; j3 <= latticeSize;j3++)
            {
                System.out.print(lattice[i3][j3] + " ");
            }
            System.out.println(" ");
        }


        //System.out.println(Arrays.deepToString(lattice));

        System.out.println("took " + (System.nanoTime()-startTime)*0.000000001 + " secs");
    }
}

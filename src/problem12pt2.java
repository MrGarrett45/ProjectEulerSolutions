//doing some testing on a better solution found in the forums

public class problem12pt2 {
    public static void main(String args[]){
        long startTime = System.nanoTime();
        int value =0;
        int count =0;
        while(true){
            value = value+(count+1);
            count++;
            if(numDiv(value)>500){
                break;
            }
        }
        System.out.println(value);
        long endTime = System.nanoTime();
        System.out.println("Process took:"+(endTime-startTime)+" ns");
    }

    public static int numDiv(int x)  //great find number of divisors method
    {
        int i;
        int num=1;
        for(i=2; i<Math.sqrt(x);i++)
        {
            if(x%i==0){
                num = num+1;
            }
        }
        return num*2;
    }
}
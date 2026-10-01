package Arrays;

public class Max_Min
{
    public static void main(String[] args)
    {
        int[] arr = {11,32,4,2,1};
        maxmin(arr);
    }
    static void maxmin(int[] num)
    {
        int max = num[0];
        int min = num[0];

        for (int i= 0; i < num.length;i++)
        {
            if (num[i] > max)
            {
                max = num[i];
            }
            else if (num[i] < min)
            {
                min = num[i];
            }
        }

        System.out.println("The max num is: " + max + " & the min num is: " + min);
    }

}

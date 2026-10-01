package Arrays;

public class large_Element
{
    public static void main(String[] args)
    {
        int[] arr = {12,23,4,26,47,65,78};
        largenum(arr);
    }
    static void largenum(int[] num)
    {
        int bignum = num[0];

        for (int i = 0; i < num.length;i++)
        {
            if (num[i] > bignum)
            {
                bignum = num[i];
            }
        }

        System.out.println("The large number is : " + bignum);
    }

}

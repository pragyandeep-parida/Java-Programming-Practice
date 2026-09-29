package Numbers;

public class ArmstrongNum
{
    public static void main(String[] args)
    {

        for (int i = 100; i < 1000; i++)
        {
            if (isArmstrong(i))
            {
                System.out.println(i + " ");
            }
        }

        //        System.out.print(isArmstrong(133));
    }

    public static boolean isArmstrong(int n)
    {
        int checknum = n;
        int armnum = 0;

        while(n > 0)
        {
            int rem = n % 10;
            n = n / 10;
            armnum = armnum + (rem * rem * rem);
        }

       return armnum == checknum;
    }
}


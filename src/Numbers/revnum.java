package Numbers;
import java.util.Scanner;

public class revnum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to reverse: ");
        int num = input.nextInt();

        int revnum = 0;

        while (num > 0)
        {
            int reverse = num % 10;
            num = num / 10;
            revnum = (revnum * 10) + reverse;
        }

        System.out.print("The reverse number is : " + revnum);

    }
}

package Numbers;
import java.util.Scanner;

public class Even_or_Odd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        int num = input.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("It is even");
        }
        else
        {
            System.out.println("It is odd");
        }

        System.out.println( oodeven(num));

    }

    public static boolean oodeven(int n)
    {
        return n % 2==0;
    }
}

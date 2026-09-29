package Numbers;
import java.util.Scanner;

public class DigitSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number:  ");
        int num = input.nextInt();

        int sum = 0;

        while(num > 0)
        {
            int rem = num %10;
            num = num/10;
            sum = sum + rem;
        }

        System.out.print("The sum of digits of number is : " + sum);
    }
}

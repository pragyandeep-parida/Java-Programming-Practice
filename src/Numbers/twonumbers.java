package Numbers;
import java.util.Scanner;

public class twonumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = input.nextInt();

        System.out.print("Enter the value of y: ");
        int y = input.nextInt();

        System.out.println("The sum of x & y: " + (x + y));

        System.out.println(sum(10,12));
    }
    public static int sum(int a, int b)
    {
        return a+ b;
    }
}

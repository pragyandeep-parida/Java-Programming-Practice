package Numbers;
import java.util.Scanner;

public class swapnumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = input.nextInt();

        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        int c;

        c = b;
        b = a;
        a = c;

        System.out.println("so a becomes : " + a + " and b becomes  :" + b);

        swapnum(10,20);
    }

    public static void swapnum(int x, int y)
    {
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("so x becomes: " + x + " and y becomes: " + y);
    }

}

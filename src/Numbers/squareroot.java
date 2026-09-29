package Numbers;
import java.util.Scanner;

public class squareroot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.println("The square root of num: " + Math.sqrt(num));
    }

    //Use babylonian//newton method understand that code also
}

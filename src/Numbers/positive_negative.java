package Numbers;
import java.util.Scanner;

public class positive_negative
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the number you want o check is +/-: ");
       int num = input.nextInt();

       if (num > 0)
       {
           System.out.println("the number is positive");
       }
       else
       {
           System.out.println("The number is negative");
       }
   }
}

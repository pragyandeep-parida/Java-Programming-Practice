package Numbers;
import java.util.Scanner;

public class Tempconvert
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temp in celcius: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.print("The temperature in fahrenite is: " + tempF);
    }
}

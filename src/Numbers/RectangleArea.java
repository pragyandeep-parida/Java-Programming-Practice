package Numbers;
import java.util.Scanner;

public class RectangleArea
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter length: ");
      int length = input.nextInt();

      System.out.print("Enter width: ");
      int width = input.nextInt();

      int area = length * width;

      System.out.println("The area of the rectangle is: " + area);

      area(11,10);
  }

  static int area(int l, int w )
  {
      int Area = l *w;
      System.out.println("the area is : " + Area);
      return Area;
  }
}

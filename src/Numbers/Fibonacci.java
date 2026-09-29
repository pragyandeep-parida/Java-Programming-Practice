package Numbers;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int count = 10;

        System.out.println("Fibonacci: " + a + " " + b);

        for (int i = 2; i < count; i++)
        {
           int c = a + b;
           System.out.print(" " + c);
           a=b;
           b=c;
        }
    }
}

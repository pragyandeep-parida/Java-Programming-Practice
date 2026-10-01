package Arrays;
import java.util.Scanner;

public class ArraySum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the range of the array: ");
        int range = input.nextInt();                            // to take the range of an array

        int[] arr = new int[range];                             //declaring array with array size

        for (int i = 0; i < arr.length;i++ )
        {
            System.out.print("Enter the array element at " + i + " : ");            //entering array elements at their index points
            arr[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];                     //adding all the array elements or i can write sum += arr[i]
        }

        System.out.println("The sum of array elements is: " + sum);

    }
}



/*
int[] arr = {1,2,3,4,5,6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        System.out.print("The sum of Array elements are: " + sum);
 */

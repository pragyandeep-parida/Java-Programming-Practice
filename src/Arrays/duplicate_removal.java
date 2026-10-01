package Arrays;

import java.util.Arrays;

public class duplicate_removal
{
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,2,3,5,4};
        int k = 1;

        for (int i = 1; i < arr.length; i++)
        {
           if (arr[i] != arr[i - 1])
           {
               arr[k] = arr[i];
               k++;
           }
        }

        System.out.println("Number of unique elements: " + k);
        System.out.println("Unique elements are: " + Arrays.toString(Arrays.copyOf(arr,k)));    // copyof(int[] original, int newlength)
    }
}

package Arrays;

import java.util.Arrays;

public class ArrayMerge
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4,5};

        int m = arr1.length;
        int n = arr2.length;

        int merge = m + n;

        int[] arr = new int[merge];   // instead of creating merge i can also do this  int[] arr = new int[m + n];
        int k = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            arr[k] = arr1[i];
            k++;
        }

        for (int j = 0; j < arr2.length; j++)
        {
            arr[k] = arr2[j];
            k++;
        }

        System.out.println(Arrays.toString(arr));       // the reason we use toString is to print arrays without it, sout will print arrays memory reference like @12abc if i simply put arr
    }
}

/*


Arr 1 value is taken
Arr 2 value is taken

The length of both array1 and array2 is added to give final array length for merged array

Basically 2 arrays cannot be merged like with each other they can merge in a new array so I created a new int[] Arr = new int[merge]; whose size is merge(sum of Array1 & Array 2)

Then I created a pointer k = 0 which will act as a index pointer for are

Now the main part to insert the contents of Array1 in Arr

LOOP-1
1- for loop
2-  Arr[k] = Arr1[I]       // basically  Arr[0] =  Arr1[0] the contents will be added
      k++				// with k increament along with i	Arr[1] = Arr1[1]

LOOP- 2

1- for loop
2-  Arr[k] = Arr2[i]       // basically  Arr[0] =  Arr2[0] the contents will be added
      k++				// with k increament along with i	Arr[1] = Arr2[1]

So the arrays are merged and Arrays.toString is used to show the final result

 */

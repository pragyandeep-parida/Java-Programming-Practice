package Arrays;

public class second_Largest
{
    public static void main(String[] args)
    {
        int[] arr = {12,18,16,11,8};
        SecLarNum(arr);
    }
    static void SecLarNum(int[] num)
    {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++)
        {
            if (num[i] > largest)
            {
                second = largest;
                largest = num[i];
            }
            else if (num[i] > second && num[i] != largest)
            {
               second = num[i];
            }
        }
        System.out.println("The largest element in array is: " + largest + " & the second largest is: " + second);
    }
}

/*
Algorithm: Find Second Largest Element in an Array (Without Sorting)

1. Initialize two variables:

   * largest → stores the largest number found so far
   * second → stores the second largest number

2. Traverse the array using a loop.

3. For every element (current element = arr[i]) check:

   Case 1: If current element > largest     //current is num[i] absically that current number used for cpmparison
   → the previous largest becomes second
   → update largest with current element

   Case 2: Else if current element > second AND current element != largest
   → update second with current element

4. Continue this process for the entire array.

5. At the end of the loop:

   * largest contains the maximum element
   * second contains the second largest element

Time Complexity: O(n)  (single traversal of array)
Space Complexity: O(1) (no extra memory used)

 */

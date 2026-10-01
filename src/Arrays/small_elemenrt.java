package Arrays;

public class small_elemenrt
{
  public static void main(String[] args)
  {
      int[] ar = {12,43,23,10,22,56};
      small(ar);
  }
  public static void small(int arr[])
  {
      int smallval = arr[0];

      for (int i = 1; i < arr.length; i++)          // start with index 1 as the 0th index is already stored in smallval
      {
          if (arr[i] < smallval)
          {
             smallval = arr[i];
          }
      }

      System.out.println("The smallest value is: " + smallval);
  }
}

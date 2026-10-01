package Arrays;

import java.util.Arrays;

public class ArraySort
{
    public static void main(String[] args)
    {
        String[] cars = {"bmw","porche","lamborghini","mercedes","audi","land rover"};

        Arrays.sort(cars);

        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }
    }
}


//check in GPT how the code works you will understand how sorting is done here
//.sort() follows unicode checking the first character with its ASCII value
// special case with lamborghini and land rover
// LAM & LAN, here m comes before N so lamborghini comes above in sorting over landrover as m's ASCII value is less than n

/*
you can also use enhaced for loop like this

for (String i : cars)
{
    System.out.println(i);
}

instead of normal loop

 Arrays.sort(cars, Collections.reverseOrder());  use this for reverse ordering we are using collection framework here from descending order

 Array Type

Collections.reverseOrder() works?  // Collections.reverseOrder() works only with object arrays (Integer[]) wrapper class, not primitive arrays (int[]).

int[] ❌ No

double[] ❌ No

char[] ❌ No

Integer[] ✅ Yes

String[] ✅ Yes
 */
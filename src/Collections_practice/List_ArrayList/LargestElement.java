package Collections_practice.List_ArrayList;

import java.util.ArrayList;

public class LargestElement
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(45);
        list.add(72);
        list.add(49);
        list.add(23);

        int large = list.get(0);

        for(int i = 1; i <list.size(); i++)
        {
            if(list.get(i) > large)
            {
                large = list.get(i);
            }
        }

        System.out.println("The largest in the array is: " + large);

    }
}

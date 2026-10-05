package Collections_practice.List_ArrayList;

import java.util.ArrayList;

public class removingDuplicates
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(2);

        int target = 2;

        for (int i = list.size() -1; i >=0; i--)
        {
            if (list.get(i).equals(target))
            {
                list.remove(i);
            }
        }

        System.out.println("final list after removing duplicates : " + list );
    }
}

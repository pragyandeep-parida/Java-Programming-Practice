package Collections_practice.List_ArrayList;

import java.util.ArrayList;

public class CountingOccurance
{
    public static void main(String[] args)
    {
       ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(2);

        int COUNT = 0;
        int target = 2;

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(target))
            {
                COUNT++;
            }
        }

        System.out.println("The target: " + target + " has occured: " + COUNT + " times");
    }
}

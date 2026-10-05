package Collections_practice.List_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class basicdemo
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        list.add(60);           // add new values

        list.set(1,15);         // setting the value of index 1 as 15 and index 2 as 35
        list.set(2,35);

        list.remove(Integer.valueOf(40));      // removing 40 by value not index number

        System.out.println(list);
    }
}

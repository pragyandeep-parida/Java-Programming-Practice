package Collections_practice.List_ArrayList;

import java.util.ArrayList;

public class reverseArraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> newlist = new ArrayList<>();

        for (int i = list.size() -1 ; i >=0; i--)
        {
            newlist.add(list.get(i));
        }

        System.out.println(newlist);
    }
}

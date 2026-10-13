package Collections_practice.Stack;

import java.util.Stack;

public class SearchElement
{
    public static void main(String[] args)
    {
        Stack<String> names = new Stack<>();

        names.push("Rahul");
        names.push("Aman");
        names.push("Priya");
        names.push("Rohit");
        names.push("Neha");

        System.out.println(names);

        System.out.println(names.contains("Neha"));   // .contains() checks if the stack has the name
        System.out.println(names.search("Rohit"));  //.search() helps look for the location of the name

        System.out.println(names.contains("Karan"));
    }
}

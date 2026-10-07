package Collections_practice.Stack;

import java.util.Stack;

public class ReverseString
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        stack.push("H");
        stack.push("e");
        stack.push("l");
        stack.push("l");
        stack.push("o");
        System.out.println(stack);

        int y = stack.size();

        for (int i = 0; i < y; i++)
        {
            String x = stack.pop();
            stack2.push(x);

        }

        System.out.println(stack2);
    }
}

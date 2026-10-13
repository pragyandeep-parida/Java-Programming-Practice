package Collections_practice.Stack;

import java.util.Stack;

public class CopyElements
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int l = stack.size();

        for (int i = 0; i < l; i++)
        {
            stack2.push(stack.get(i));
        }

        System.out.println("Stack2 : " + stack2);
        System.out.println(stack.empty());
    }

}

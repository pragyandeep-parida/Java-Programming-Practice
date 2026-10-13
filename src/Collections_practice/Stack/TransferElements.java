package Collections_practice.Stack;

import java.util.Stack;

public class TransferElements
{
    public static void main(String[] args)
    {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        while (!stack1.empty())
        {
            stack2.add(0,stack1.pop());
        }

        System.out.println(stack1.empty());
        System.out.println("Stack1: " + stack1);

        System.out.println("Stack2: " + stack2);
    }
}

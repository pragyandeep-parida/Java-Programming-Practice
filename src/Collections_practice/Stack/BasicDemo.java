package Collections_practice.Stack;

import java.util.Stack;

public class BasicDemo
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        System.out.println( stack.peek() + " - The top element of stack");

        stack.pop();
        stack.pop();
        System.out.println(stack + " - After removing 2 elements");
    }
}

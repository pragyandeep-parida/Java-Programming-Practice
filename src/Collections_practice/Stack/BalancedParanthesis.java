package Collections_practice.Stack;

import java.util.Stack;

public class BalancedParanthesis
{
    public static boolean isBalanced(String input)
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}')
            {
                if (stack.empty())
                {
                    return false;
                }

                char top = stack.peek();

                if (( ch == ')' && top == '(') || (ch == ']' && top =='[') || (ch =='}' && top == '{'))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args)
    {
        System.out.println(isBalanced("{[()]}"));    //true
        System.out.println(isBalanced("[(}]"));      //false
    }
}

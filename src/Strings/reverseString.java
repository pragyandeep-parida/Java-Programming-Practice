package Strings;

public class reverseString
{
    public static void main(String[] args)
    {
        String original = "Hello bhai";
        String reverse = " ";

        for (int i = original.length() -1 ; i >=0; i--)
        {
            reverse = reverse + original.charAt(i) ;
        }

        System.out.println(reverse);
    }
}
//for the above code
// Loop from last index to first (reverse direction)
// For each index, pick character using charAt(i)
// Append it to 'reverse' string
// This builds the reversed string step by step


/*  ANOTHER METHOD

 String original = "Hello World";
       String reverse = " ";

        for (int i =0; i < original.length(); i++)
        {
            reverse = original.charAt(i) + reverse;
        }

        System.out.println("The reverse string is : " + reverse);

 // Loop from start to end of string
// For each character, add it at the beginning of 'reverse'
// This shifts previous characters to the right
// So final string gets built in reverse order

 */


/*
       StringBuilder original = new StringBuilder("Hello world");
       original.reverse();

        System.out.println(original);
 */
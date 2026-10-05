package Strings;

public class Palindrome
{
    public static void main(String[] args)
    {
        String original  = "madam";
        String crosscheck = original;
        String reverse = "";

        for (int i = original.length() - 1 ; i>=0 ; i-- )
        {
            reverse = reverse + original.charAt(i);
        }

        System.out.println(reverse);

        if (crosscheck.equals(reverse))
        {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
LOGIC: CHECK PALINDROME BY REVERSING STRING

1. Initialize reverse = "" (IMPORTANT: do NOT use " " as it adds extra space and breaks comparison)

2. Loop from last index to 0:
   - pick each character using charAt(i)
   - append it to reverse

3. After loop, reverse contains reversed string

4. Compare original and reverse using equals()
   - if equal → Palindrome
   - else → Not Palindrome

NOTE:
Using " " instead of "" adds an extra space, so strings will not match
*/
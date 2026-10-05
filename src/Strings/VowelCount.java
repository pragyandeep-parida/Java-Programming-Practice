package Strings;

public class VowelCount
{
    public static void main(String[] args)
    {
        String s = "HEllo World";
        int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.toLowerCase().charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println("The total no.of vowels are : " + count );
    }
}

/*
LOGIC: COUNT VOWELS IN A STRING

1. String is a sequence of characters, indexed from 0 to length-1.

2. We use a for loop:
   - i starts from 0
   - runs till i < s.length()
   - this helps us visit every character in the string

3. charAt(i):
   - returns the character at index i
   - for every iteration, we get one character from the string

4. toLowerCase():
   - converts entire string to lowercase
   - important because it avoids checking both uppercase and lowercase vowels
   - NOTE: String is immutable, so we must assign it back → s = s.toLowerCase()

5. Inside loop:
   - we store each character in variable 'ch'
   - ch holds only ONE character at a time (not the whole string)

6. Vowel check:
   - compare ch with 'a', 'e', 'i', 'o', 'u'
   - use OR (||) operator
   - if any condition is true → it is a vowel

7. If vowel found:
   - increment count

8. Time Complexity: O(n)
   - we traverse the string once

9. Space Complexity: O(1)
   - no extra space used

SUMMARY:
- Loop through string → pick each character → check if vowel → increase count
*/

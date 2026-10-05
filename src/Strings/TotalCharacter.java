package Strings;

public class TotalCharacter
{
    public static void main(String[] args)
    {
        String s = "I will crack Google";
        s = s.trim().toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch != ' ')
            {
                count++;
            }
        }

        System.out.println("The total no.of characters are: " + count);
    }
}

/*
LOGIC:

1. Loop through the string from index 0 to length-1.

2. For each index, use charAt(i) to get one character (ch).

3. Check: if (ch != ' ')
   - This means: character is NOT a space
   - So it is a valid character (letter/symbol)

4. If condition is true → increment count.

5. If character is a space → ignore it.

SUMMARY:
Count only those characters which are not equal to space (' ')
*/

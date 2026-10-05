package Strings;

public class CountWords
{
    public static void main(String[] args)
    {
        String word = "Hello     new     World";
        int countwords = word.trim().split("\\s+").length;    // .split(//s) ❌ invalid as java treats // as comment

        System.out.println(countwords);
    }
}


// Step 1: trim() removes leading and trailing spaces from the string
// Example: "   Hello   new   World   " -> "Hello   new   World"

// Step 2: split("\\s+") splits the string based on one or more whitespace characters
// \s  -> represents a single whitespace (space, tab, etc.)
// +   -> means "one or more occurrences"
// So multiple spaces like "   " are treated as a single separator

// Example:
// "Hello   new   World".split("\\s+") -> ["Hello", "new", "World"]

// Step 3: split() returns a String array containing all words

// Step 4: .length gives the total number of elements in the array,
// which is equal to the number of words in the string

/*
| What you wrote | Meaning          | Result    |
| -------------- | ---------------- | --------- |
| `//s`          | comment          | ❌ wrong   |
| `"\s"`         | invalid escape   | ❌ wrong   |
| `"\\s"`        | regex whitespace | ✅ correct |

 */



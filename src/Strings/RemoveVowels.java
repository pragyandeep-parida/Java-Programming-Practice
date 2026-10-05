package Strings;

public class RemoveVowels
{
    public static void main(String[] args)
    {
        String s = "Hello Google I am Coming ";
        s = s.toLowerCase();

        String result = " ";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')   // dont use OR operator here use AND operator because OR wont be correct logic you know why
            {
                result = result + ch;
            }
        }

        System.out.println("The final code is: " + result);
    }
}

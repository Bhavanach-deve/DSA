package Strings.Day1;
//Given a string s. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. s contains only lowercase letters.
public class FirstOccuranceRepeatedCharacter
{
    public static String whoseIndexofSecondOccuranceisSmallest() {
        String s = "hellogeeks";
        boolean seen[] = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            if (seen[index]) {
                return String.valueOf(ch);
            }
            seen[index] = true;
        }
        return "-1";
    }

    public static void main(String[] args)
    {
        String s=whoseIndexofSecondOccuranceisSmallest();
        System.out.println(s);
    }
}

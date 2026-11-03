package Strings.Day3;
//Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.
public class FirstNonRepeatingCharacters
{
    public static char firstNonRepeat(String s)
    {
        int []freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;

        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(freq[ch-'a']==1)
            {
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args)
    {
        String s="javacoding";
        char result=firstNonRepeat(s);
        System.out.println(result);
    }
}

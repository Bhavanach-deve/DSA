package Strings.Day3;

public class FindTheDifferenceBWTwoStrings
{
    public static char findTheDifference(String s, String t)
    {
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++) {
            char ch=t.charAt(i);

            freq[ch-'a']--;

            if(freq[ch-'a']<0) {
                return ch;
            }
        }
        return '\0';
    }
    public static char findTheDifference2(String s, String t)
    {
        char result=0;
        for(int i=0;i<s.length();i++) {
            result^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++) {
            result^=t.charAt(i);
        }
        return result;
    }

    public static void main(String[] args)
    {
        String s="abcd";
        String t="abcde";

        char ans=findTheDifference(s,t);
        System.out.println(ans);

        String s1="abcd";
        String t1="abcde";
        char ans1=findTheDifference2(s1,t1);
        System.out.println(ans1);
    }
}

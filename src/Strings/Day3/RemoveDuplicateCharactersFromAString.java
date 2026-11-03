package Strings.Day3;

import java.util.HashSet;

public class RemoveDuplicateCharactersFromAString
{
    public static String duplicateRemoval(String s)
    {
        HashSet<Character> set=new HashSet<Character>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="Happy Diwali";
        System.out.println(duplicateRemoval(s));
    }
}

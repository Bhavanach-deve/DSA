package Strings.Day3;

import java.util.HashSet;

public class CountDistinctCharacters
{
    public static int countDistinct(String s){
        HashSet<Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }

    public static void main(String[] args) {
        String s="javaprogramming";
        int count=countDistinct(s);
        System.out.println(count);
    }
}

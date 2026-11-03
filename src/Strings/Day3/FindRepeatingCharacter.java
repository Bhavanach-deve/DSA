package Strings.Day3;
//Find the character whose second occurrence has the smallest index.
public class FindRepeatingCharacter
{
    public static String firstRepChar(String s){
        boolean []visited=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=ch-'a';

            if(visited[index]){
                return String.valueOf(ch);
            }
            visited[index]=true;
        }
        return "-1";
    }

    public static void main(String[] args)
    {
        String s="abccba";
        String ans=firstRepChar(s);
        System.out.println(ans);

    }
}

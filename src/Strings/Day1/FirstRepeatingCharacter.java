//We return the first character whose later occurrence exists, not necessarily the character that repeats earliest in the string.
package Strings.Day1;
class Sol{
    public String firstRepChar(String s){

        char ans='\0';
        for(int i=0;i<s.length();i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    ans = s.charAt(i);
                    break;
                }
            }
            if (ans != '\0') {
                break;
            }
        }
            if(ans=='\0'){
                System.out.println("No repeating character");
            }else{
                System.out.println(ans);
            }
        return String.valueOf(ans);
    }
}

public class FirstRepeatingCharacter
{
    public static void main(String[] args)
    {
        Sol s=new Sol();
        String s1="geeksforgeeks";
        s.firstRepChar(s1);
    }
}

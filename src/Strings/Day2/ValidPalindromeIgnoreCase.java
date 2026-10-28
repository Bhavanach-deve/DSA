package Strings.Day2;
//Check whether a string is a palindrome regardless of uppercase or lowercase letters.
public class ValidPalindromeIgnoreCase
{
    public static boolean isPalindrome(){
        String s="Madam";
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char a=Character.toLowerCase(s.charAt(left));
            char b=Character.toLowerCase(s.charAt(right));

            if(a!=b){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        boolean res=isPalindrome();
        System.out.println("Is the given string a valid palindrome? "+res);
    }
}

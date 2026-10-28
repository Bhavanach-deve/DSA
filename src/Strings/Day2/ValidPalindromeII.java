package Strings.Day2;
//Determine whether a string can become a palindrome by deleting at most one character.
class Solve{
    public boolean validPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isRangePlaindrome(s,left+1,right) || isRangePlaindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isRangePlaindrome(String s,int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class ValidPalindromeII
{
    static void main(String[] args) {
        Solve s=new Solve();
        boolean res=s.validPalindrome("abca");
        System.out.println("Can we form a palindrome by deleting a letter from a string? "+res);
    }
}

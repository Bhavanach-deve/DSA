package Strings.Day1;

public class CheckPalindrome
{
    public static boolean isPalindorme() {
        String s = "madam";
        int i = 0;
        int j = s.length() - 1;
        boolean flag = false;
        while (i<j) {
            if (s.charAt(i) != s.charAt(j)) {
                return flag;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Is Palindrome "+isPalindorme());
    }
}

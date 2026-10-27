//Convert lowercase letters to uppercase and uppercase letters to lowercase.
package Strings.Day1;

public class ConvertCase
{
    public static void main(String[] args)
    {
    String s="tHE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    String ss="";
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch>='A'&& ch<='Z'){
            ch = (char) (ch + 32);
        }else if(ch>='a'&&ch<='z'){
            ch = (char) (ch - 32);
        }
        ss=ss+ch;
    }
        System.out.println(ss);
    }
}

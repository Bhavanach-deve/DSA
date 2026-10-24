package Strings.Day1;

public class RemoveSpaces
{
    public static void main(String[] args)
    {
        String s="Hey Java Developers!";
        String us="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch!=' '){
                us=us+ch;
            }
        }
        System.out.println(us);
    }
}

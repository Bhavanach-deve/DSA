package Strings.Day1;

class StringReversal{
    static String appendReverse()
    {
        String s="India";
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
            System.out.println(r);
        }
        return r;
    }
    static void UsingCharArray(){
        String s="Hyderabad";
        char[]arr=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}

public class ReverseAString
{
    public static void main(String[] args)
    {
        String appendAns=StringReversal.appendReverse();
        System.out.println("Using s.toCharArray: ");
        StringReversal.UsingCharArray();

    }
}

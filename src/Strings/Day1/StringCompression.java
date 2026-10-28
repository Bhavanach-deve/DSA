//Compress consecutive repeated characters by writing each character followed by its count.
package Strings.Day1;

public class StringCompression
{
   public static void main(String[] args)
   {
       String s="aaabbcccc";
       String result="";
       if(s.isEmpty()){
           System.out.println("");
           return;
       }
       int count=1;

       for(int i=1;i<s.length();i++){
           if(s.charAt(i)==s.charAt(i-1)){
               count++;
           }else {
               result =result+s.charAt(i-1)+count;
               count=1;
           }
       }
       result=result+s.charAt(s.length()-1)+count;

       System.out.println(result);
    }
}

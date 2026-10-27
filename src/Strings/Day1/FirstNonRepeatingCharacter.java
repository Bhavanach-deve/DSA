//Find the first character that appears exactly once.
package Strings.Day1;

public class FirstNonRepeatingCharacter
{
    public static void main(String[] args)
    {
        char ch='\0';
        String s = "aabbcddee";

        for(int i=0;i<s.length();i++){
            int count=0;

            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                ch=s.charAt(i);
                break;
            }
        }
        if(ch=='\0'){
            System.out.println("No non-repeating character");
        }else{
            System.out.println(ch);
        }
    }
}

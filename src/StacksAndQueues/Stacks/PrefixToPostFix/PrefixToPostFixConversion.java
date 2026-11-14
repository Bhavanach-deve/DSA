package StacksAndQueues.Stacks.PrefixToPostFix;

import java.util.Stack;

public class PrefixToPostFixConversion
{
    public static String prefixToPostFix(String s)
    {
        Stack<String> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);

            if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')){
                stack.push(String.valueOf(ch));
            }else{
                String t1=stack.pop();
                String t2=stack.pop();

                String converted=t1+t2+ch;
                stack.push(converted);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args)
    {
        String s="/-AB*+DEF";
        System.out.println("Prefix expression: "+s);
        System.out.println("Postfix conversion: "+prefixToPostFix(s));
    }
}

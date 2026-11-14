package StacksAndQueues.Stacks.PostFixToPrefix;

import java.util.Stack;

public class PostFixToPreFixConversion
{
    public static String  postToInfix(String s)
    {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')){
                stack.push(String.valueOf(ch));
            }else{
                String t1=stack.pop();
                String t2=stack.pop();

                String converted=ch+t2+t1;
                stack.push(converted);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args)
    {
        String s="AB-DE+F*/";
        System.out.println("PostFix expression: "+s);
        System.out.println("PreFix expression: "+postToInfix(s));
    }
}

package StacksAndQueues.Stacks.PostFixToInfix;

import java.util.Stack;

public class PostFixToInfixConversion
{
    public static String postToInfix(String str)
    {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            // 1. If operand, convert to String and push to stack
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
            {
                stack.push(String.valueOf(ch));
            }// // 2. If operator, pop two operands
            else {
                // First pop is the RIGHT operand
                String t1 = stack.pop();
                // Second pop is the LEFT operand
                String t2 = stack.pop();

                // Form: (leftOperand + operator + rightOperand)
                String converted = "(" + t2 + ch + t1 + ")";
                // Push the combined expression back onto the stack
                stack.push(converted);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args)
    {
        String s1="AB-DE+F*/";
        System.out.println("PostFix expression: "+s1);
        String ans=postToInfix(s1);
        System.out.println("Infix expression: "+ans);

    }
}

package StacksAndQueues.Stacks.InfixToPreFix;

import java.util.Stack;

public class InfixToPrefixConversion
{
    public static String infixToPrefix(String s) {
        // Step 1: Reverse string and swap '(' with ')'
        String reversedInfix = reverseAndSwapBrackets(s);

        // Step 2: Convert modified infix to postfix
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < reversedInfix.length(); i++) {
            char ch = reversedInfix.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                res.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    res.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && (ch == '^' ? priority(ch) <= priority(stack.peek()) : priority(ch) < priority(stack.peek()))) {
                    res.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    public static int priority(char ch) {
        if (ch == '^') {
            return 3;
        }
        if ((ch == '*') || (ch == '/')) {
            return 2;
        }
        if ((ch == '+') || (ch == '-')) {
            return 1;
        }
        return -1;
    }
    public static String reverseAndSwapBrackets(String s){
        char[]arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            char temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        //Swap brackets
        for(int i=0;i<n;i++){
            if(arr[i]=='('){
                arr[i]=')';
            }else if(arr[i]==')'){
                arr[i]='(';
            }
        }
        return new String(arr);
    }


    public static void main(String[] args)
    {

        String s = "a+b*(c^d-e)";
        System.out.println("Infix:  " + s);
        System.out.println("Prefix: " + infixToPrefix(s));
        String s2 = "(A+B)*C-D/E";
        System.out.println("\nInfix:  " + s2);
        System.out.println("Prefix: " + infixToPrefix(s2));
    }
}

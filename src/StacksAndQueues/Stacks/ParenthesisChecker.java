package StacksAndQueues.Stacks;
//Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. Determine whether the Expression is balanced or not.

import java.util.Stack;

public class ParenthesisChecker
{
    public static boolean validParenthesisStriver(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')'&&top!='(')||(ch==']'&&top!='[')||(ch=='}'&&top!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static boolean validParenthesis(String s)
    {
        char[]stack=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                top++;
                stack[top] = ch;
            } else {
                if (top == -1) {
                    return false;
                }
                char open = stack[top];
                top--;
                if ((ch == ')' && open != '(') || (ch == ']' && open != '[') || (ch == '}' && open != '{')) {
                    return false;
                }
            }

            }
        return top==-1;
    }
    public static void main(String[] args)
    {
        String s="()[{}()]";
        System.out.println(validParenthesis(s));
        String s1="()[{}()]";
        System.out.println(validParenthesisStriver(s1));

    }
}

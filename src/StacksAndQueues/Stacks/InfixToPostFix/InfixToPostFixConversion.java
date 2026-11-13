package StacksAndQueues.Stacks.InfixToPostFix;

import java.util.Stack;

public class InfixToPostFixConversion
{
    public String toPostFix(String s){

        StringBuilder res=new StringBuilder();
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9'))
            {
                res.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    res.append(stack.pop());
                }if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                while(!stack.isEmpty()&&(ch=='^'?priority(ch)<priority(stack.peek()):priority(ch)<=priority(stack.peek())))
                {
                    res.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
    public int priority(char ch){
        if(ch=='^'){
            return 3;
        }else if(ch=='*'||ch=='/'){
            return 2;
        }
        else if(ch=='+'||ch=='-'){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args)
    {

        InfixToPostFixConversion obj=new InfixToPostFixConversion();
        String s="a+b*(c^d-e)";
        System.out.println("Input: "+s);
        System.out.println("Output: "+obj.toPostFix(s));
    }
}

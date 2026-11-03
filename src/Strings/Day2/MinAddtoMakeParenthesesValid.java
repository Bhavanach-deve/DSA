package Strings.Day2;
//You are given a string s consisting only of the characters '(' and ')'. Your task is to determine the minimum number of parentheses (either '(' or ')') that must be inserted at any positions to make the string s a valid parentheses string.
//
//A parentheses string is considered valid if:
//
//Every opening parenthesis '(' has a corresponding closing parenthesis ')'.
//Every closing parenthesis ')' has a corresponding opening parenthesis '('.
//Parentheses are properly nested.
public class MinAddtoMakeParenthesesValid
{
    public static int minAdditions(String s){
        int open=0;
        int addition=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }else if(s.charAt(i)==')'){
                if(open>0){
                    open--;
                }
            }else{
                addition++;
            }
        }
        return addition+open;
    }

    public static void main(String[] args)
    {
        String s="(((";
        int howManyMore=minAdditions(s);
        System.out.println(howManyMore);

    }
}

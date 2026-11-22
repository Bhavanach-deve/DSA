//Given a non-negative integer s represented as a string and an integer k, remove exactly k digits from the string so that the resulting number is the smallest possible, while maintaining the relative order of the remaining digits.
//The resulting number must not contain any leading zeros.
//If the resulting number is an empty string after the removal, return "0".
package StacksAndQueues.Stacks;

import java.util.Stack;

public class RemoveKDigits
{
    public static String removeKDigits(String s,int k)
    {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            while(!stack.isEmpty() && k>0 && stack.peek()>ch ){
                stack.pop();
                k=k-1;
            }
            stack.push(ch);
        }
        //  // Remove remaining digits if k is still greater than 0
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k=k-1;
        }
        // Build the number in original order
        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        res.reverse();

        // Remove leading zeros
        int i = 0;

        while (i < res.length() && res.charAt(i) == '0') {
            i++;
        }

        res = new StringBuilder(res.substring(i));

        // If empty, return 0
        if (res.length() == 0) {
            return "0";
        }

        return res.toString();

    }


    public static void main(String[] args)
    {
        String s="1432219";
        int k=3;
        System.out.println(removeKDigits(s,k));

    }
}

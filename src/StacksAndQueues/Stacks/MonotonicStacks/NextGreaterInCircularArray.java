package StacksAndQueues.Stacks.MonotonicStacks;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterInCircularArray
{
    public ArrayList<Integer> nextGreater(int[]arr)
    {
        Stack<Integer>stack = new Stack<>();
        int n=arr.length;
        int[]nge=new int[n];

        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i%n]){
                stack.pop();
            }
            if(i<n){
                nge[i]=stack.isEmpty()?-1:stack.peek();
            }
            stack.push(arr[i%n]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int val:nge){
            res.add(val);
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr={2,10,12,1,11};
        NextGreaterInCircularArray obj=new NextGreaterInCircularArray();
        System.out.println(obj.nextGreater(arr));
    }
}

//You are given an array arr[] of integers, the task is to find the next greater for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
//If there does not exist next greater of current element, then next greater element for current element is -1.
package StacksAndQueues.Stacks.MonotonicStacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement
{
    public ArrayList<Integer> nextLargest(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[]nge=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            nge[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int val:nge){
            res.add(val);
        }
        return res;
    }


    public static void main(String[] args)
    {
        NextGreaterElement obj = new NextGreaterElement();
        int[] arr = {4,12,5,3,1,2,5,3,1,2,4,6};
        System.out.println(obj.nextLargest(arr));


    }
}

//Given an array arr[] of positive integers and an integer k. Find the maximum value for each contiguous subarray of size k.
//Return an array of maximum values corresponding to each contiguous subarray.
package StacksAndQueues.Deque;

import java.util.*;

public class SlidingWindowMaximum
{
    public static ArrayList<Integer>WindowMax(int arr[],int k)
    {
        int n=arr.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Deque<Integer> deq=new ArrayDeque<>();
        if(k<=0||k>n){
            return list;
        }
        for(int i=0;i<n;i++){
            if(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.pollFirst();
            }
            while(!deq.isEmpty()&&arr[deq.peekLast()]<=arr[i]){
                deq.pollLast();
            }
            deq.addLast(i);
            if(i>=k-1){
                list.add(arr[deq.peekFirst()]);
            }
        }
        return list;

    }

    public static void main(String[] args)
    {
        int arr[]={1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k=3;
        ArrayList<Integer>result=WindowMax(arr,k);
        System.out.println(result);


    }
}

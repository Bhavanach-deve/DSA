//Given an unsorted array arr[] of integers, find the number of subarrays whose sum exactly equal to a given number k.
package ArrayProblems.Day3;

import java.util.HashMap;

public class SubArraysWithSumK {

    public static int countSubArray(int arr[],int k)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefixSum=0;
        int count=0;
        map.put(0,1);
        for(int nums:arr){
            prefixSum+=nums;

            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args)
    {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        System.out.println(countSubArray(arr,k));

    }

}

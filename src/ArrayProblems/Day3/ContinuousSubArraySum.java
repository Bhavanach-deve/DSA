//Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
//A good subarray is a subarray where:
//its length is at least two, and
//the sum of the elements of the subarray is a multiple of k.
//Note that:
//A subarray is a contiguous part of the array.
//An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
package ArrayProblems.Day3;

import java.util.HashMap;

public class ContinuousSubArraySum
{
    public static boolean checkSubArraySum(int arr[],int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefixSum=0;

        for(int i=0;i<arr.length;i++)
        {
            prefixSum+=arr[i];

            int rem=prefixSum%k;
            if(map.containsKey(rem))
            {
                if(i-map.get(rem)>=2){
                    return true;
                }
            }
            else{
                map.put(rem,i);
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[]={23,2,4,6,7};
        System.out.println(checkSubArraySum(arr,6));


    }
}

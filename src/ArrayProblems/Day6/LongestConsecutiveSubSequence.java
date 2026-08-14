//Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
package ArrayProblems.Day6;

import java.util.HashSet;

public class LongestConsecutiveSubSequence
{
    public static int longestConsecutive(int arr[])
    {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
           set.add(num);
        }
        int longest=0;
        for(int nums:set)
        {
            if(!set.contains(nums-1)){
                int current=nums;
                int count=1;

                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }

    public static void main(String[] args)
    {
        int arr[]={15, 13, 12, 14, 11, 10, 9};
        System.out.println(longestConsecutive(arr));

    }
}

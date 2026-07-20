//Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.
package ArrayProblems;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesInLimitedRangeArray
{
    public static ArrayList<Integer>findDuplicates(int[] arr)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int freq[]=new int[n+1];
        for(int nums:arr){
            freq[nums]++;

            if(freq[nums]==2){
                ans.add(nums);
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={2,3,2,1,3};
        System.out.println(findDuplicates(arr));
    }
}

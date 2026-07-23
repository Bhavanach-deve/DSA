//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
package ArrayProblems.Day3;

public class RunningSumOf1DArrayLeetCode
{
    public static int[] prefixSum(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        int ans[]=prefixSum(arr);
        for(int nums:ans)
        {
            System.out.print(nums+" ");
        }
    }
}

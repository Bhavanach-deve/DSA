//Given an integer array nums, return the maximum absolute sum of any subarray.
//The absolute sum of a subarray is
//|sum of the subarray|
package ArrayProblems.Day4;

public class MaximumAbsoluteSumofAnySubarray
{
    public static int maxAbsoluteSum(int[]arr)
    {
        int maxSum=arr[0];
        int currMax=arr[0];

        int minSum=arr[0];
        int currMin=arr[0];

        for(int i=1;i<arr.length;i++){
            currMax=Math.max(arr[i],currMax+arr[i]);
            maxSum=Math.max(maxSum,currMax);

            currMin=Math.min(arr[i],currMin+arr[i]);
            minSum=Math.min(minSum,currMin);
        }
        return Math.max(maxSum,-minSum);
    }

    public static void main(String[] args)
    {
        int arr[]={-2,-3,-4};
        System.out.println(maxAbsoluteSum(arr));

    }
}

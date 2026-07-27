//Given an integer array nums, find the subarray with the largest sum, and return its sum.
package ArrayProblems.Day4;

public class MaximumSubArray
{
    public static int kadaneMaxSum(int arr[])
    {
        int current=0;
        int max=Integer.MIN_VALUE;
        for(int nums:arr)
        {
            current+=nums;

            max=Math.max(max,current);

            if(current<0){
                current=0;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadaneMaxSum(arr));

    }
}

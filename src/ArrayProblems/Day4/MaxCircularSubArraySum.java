//You are given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.
package ArrayProblems.Day4;

public class MaxCircularSubArraySum
{
    public static int maxCircularSum(int arr[])
    {
        int totalSum=0;
        int currMaxSum=0;
        int currMinSum=0;
        int maxSum=arr[0];
        int minSum=arr[0];

        for(int i=0;i<arr.length;i++){
            currMaxSum=Math.max(currMaxSum+arr[i],arr[i]);
            maxSum=Math.max(maxSum,currMaxSum);

            currMinSum=Math.min(currMinSum+arr[i],arr[i]);
            minSum=Math.min(minSum,currMinSum);
            totalSum+=arr[i];
        }
        int normalSum=maxSum;
        int circularSum=totalSum-minSum;

        if(minSum==totalSum){
            return normalSum;
        }
        return Math.max(normalSum,circularSum);
    }

    public static void main(String[] args)
    {
        int arr[]={8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxCircularSum(arr));
    }
}

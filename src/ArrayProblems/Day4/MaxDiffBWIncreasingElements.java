//Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
//Return the maximum difference. If no such i and j exists, return -1.
package ArrayProblems.Day4;

public class MaxDiffBWIncreasingElements
{
    public static int maxDiffBrute(int arr[])
    {
        int n=arr.length;
        int diff=0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    diff=arr[j]-arr[i];
                    max=Math.max(max,diff);
                }
            }
            return max;
        }
        return -1;
    }
    public static int KadanesMax(int arr[])
    {
        int n=arr.length;
        int diff=arr[1]-arr[0];
        int currSum=diff;
        int maxSum=-1;
        if(currSum>0){
            maxSum=currSum;
        }
        for(int i=1;i<n-1;i++){
            diff=arr[i+1]-arr[i];

            if(currSum>0){
                currSum+=diff;
            }else{
                currSum=diff;
            }if(currSum>0 && currSum>maxSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args)
    {
        int arr[]={1,5,2,10};
        System.out.println(maxDiffBrute(arr));
        System.out.println(KadanesMax(arr));
    }
}

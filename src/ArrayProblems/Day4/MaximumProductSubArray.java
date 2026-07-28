//Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].
package ArrayProblems.Day4;

public class MaximumProductSubArray
{
    //Max product using Suffix and prefix method
    public static int maxProd(int arr[])
    {
        int n=arr.length;
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            prefix*=arr[i];
            suffix*=arr[n-1-i];
            max=Math.max(max,Math.max(prefix,suffix));

            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }

        }
        return max;
    }
    //Max product using DP kadane's
    public static int maxProdDP(int arr[])
    {
        int maxEnding=arr[0];
        int minEnding=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=maxEnding;
                maxEnding=minEnding;
                minEnding=temp;
            }
            maxEnding=Math.max(arr[i],maxEnding*arr[i]);
            minEnding=Math.min(arr[i],minEnding*arr[i]);
            ans=Math.max(ans,maxEnding);
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int arr[]={-2,6,-3,-10,0,2};
        System.out.println(maxProd(arr));
        System.out.println(maxProdDP(arr));


    }

}

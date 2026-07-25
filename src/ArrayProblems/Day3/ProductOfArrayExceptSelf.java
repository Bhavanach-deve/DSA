//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
package ArrayProblems.Day3;

public class ProductOfArrayExceptSelf
{
    public static int[] productExceptSelf(int arr[])
    {
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        int suffix[]=new int[n];
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=prefix[i]*suffix[i];
        }
        for(int nums:ans){
            System.out.print(nums+" ");
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int arr[]={9,0,-2};
        productExceptSelf(arr);

    }
}

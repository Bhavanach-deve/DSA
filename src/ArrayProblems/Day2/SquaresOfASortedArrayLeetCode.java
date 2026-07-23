package ArrayProblems.Day2;

import java.util.Arrays;

public class SquaresOfASortedArrayLeetCode
{
    public static int [] sortedSquares(int arr[])
    {
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i]*arr[i];
        }
        Arrays.sort(temp);
        for(int nums:temp){
            System.out.print(nums+" ");
        }
        return temp;
    }
    public static int[] sortedSquaresOptimized(int arr[])
    {
        int n=arr.length;
        int []ans=new int[n];
        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
                ans[index]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[index]=arr[right]*arr[right];
                right--;
            }
            index--;
        }

        for(int res:ans){
            System.out.print(res+" ");
        }
        return ans;
    }


    public static void main(String[] args)
    {

        int arr[]={-4,-1,0,3,10};
        sortedSquares(arr);
        System.out.println();
        int arr1[]={-7,-3,2,3,11};
        sortedSquaresOptimized(arr1);
    }
}

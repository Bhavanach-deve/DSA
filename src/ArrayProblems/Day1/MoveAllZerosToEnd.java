//You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.
package ArrayProblems.Day1;

import java.util.Arrays;

public class MoveAllZerosToEnd
{
    public static void pushZerosToEnd(int arr[])
    {
        int n=arr.length;
        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }

    public static void main(String[] args)
    {
        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);


    }
}

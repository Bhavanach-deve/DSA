//You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.
package ArrayProblems.Day6;

import java.util.Arrays;

public class MissingInArray
{
    public static int MissingNum(int arr[])
    {
       int n=arr.length+1;
       int xor1=0,xor2=0;
       for(int i=0;i<n-1;i++){
           xor2^=arr[i];
       }
       for(int i=1;i<=n;i++){
           xor1^=i;
       }
       return xor1^xor2;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,5};
        System.out.println(MissingNum(arr));

    }
}

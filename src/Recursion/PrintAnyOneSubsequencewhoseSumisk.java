package Recursion;

import java.util.ArrayList;

public class PrintAnyOneSubsequencewhoseSumisk
{
    public static boolean checkSubsequenceSum(int[] arr, int k) {
        return solve(0, arr, k, 0);
    }

    private static boolean solve(int i, int[] arr, int k, int curr) {

        if (i == arr.length) {
            return curr == k;
        }

        // Include OR Exclude
        return solve(i + 1, arr, k, curr + arr[i])
                || solve(i + 1, arr, k, curr);
    }


    public static void main(String[] args)
    {
        int arr[]={1,2,1};
        boolean ans=checkSubsequenceSum(arr, 2);
        System.out.println(ans);

    }
}

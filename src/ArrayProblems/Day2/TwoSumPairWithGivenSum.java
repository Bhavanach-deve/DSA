package ArrayProblems.Day2;

import java.util.Arrays;

public class TwoSumPairWithGivenSum
{
    public static boolean twoSum(int arr[],int target) {
        int i = 0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[]={0,-1,2,-3,1};
        int target=-2;
        twoSum(arr,target);
    }
}

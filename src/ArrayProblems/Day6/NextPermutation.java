//Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order).
package ArrayProblems.Day6;

public class NextPermutation
{
    public static void nextPermutation(int[]nums)
    {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        reverse(nums,i+1,nums.length-1);
    }
    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,5,4,3};
        nextPermutation(arr);
        for(int ans:arr){
            System.out.print(ans+" ");
        }
    }
}

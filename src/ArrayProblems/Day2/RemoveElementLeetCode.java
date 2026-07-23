//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
// Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.
package ArrayProblems.Day2;

import java.util.Arrays;

import static java.util.Collections.swap;

public class RemoveElementLeetCode
{
    public static int removeElementsOtimal(int []arr,int val)
    {
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }

    public static int removeElement(int arr[],int val)
    {
        int i=0;
        int n=arr.length;

        while(i<n)
        {
            if(arr[i]!=val)
            {
                arr[i]=arr[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args)
    {
        int arr[]={3,2,2,3};
        int val=3;
        System.out.println(removeElement(arr,val));
        int arr1[]={3,2,2,3};
        int val1=3;
        System.out.println(removeElementsOtimal(arr1,val1));
    }
}

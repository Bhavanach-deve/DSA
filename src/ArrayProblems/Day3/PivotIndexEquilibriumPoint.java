//Given an array of integers arr[], the task is to find the first equilibrium point in the array.
//The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists.
package ArrayProblems.Day3;

public class PivotIndexEquilibriumPoint
{
    public static int findEquilibrium(int arr[])
    {
        int n=arr.length;

        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++)
        {
            int leftsum=(i==0)?0:prefix[i-1];
            int rightsum=prefix[n-1]-prefix[i];

            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,0,3};
        System.out.println(findEquilibrium(arr));

    }
}

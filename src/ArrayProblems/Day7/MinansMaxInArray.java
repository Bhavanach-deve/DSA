//Find the maximum and minimum element in one traversal.
package ArrayProblems.Day7;

import java.util.ArrayList;

public class MinansMaxInArray
{
    public static ArrayList<Integer> getMaxMin(int arr[])
    {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }
        ans.add(mini);
        ans.add(maxi);

        return ans;
    }


    public static void main(String[] args)
    {
        int arr[]={1,4,3,5,8,6};
        System.out.println(getMaxMin(arr));
    }
}

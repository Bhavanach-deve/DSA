package ArrayProblems.Day1;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray
{
    public static ArrayList<Integer> removeDuplicates(int[] arr)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        if(arr.length==0){
            return ans;
        }
        ans.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }


    public static void main(String[] args)
    {
        int arr1[]={2,2,2,2};
        int arr2[]={1,2,4};
        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));


    }
}

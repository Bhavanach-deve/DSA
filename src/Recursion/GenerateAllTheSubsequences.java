package Recursion;

import java.util.ArrayList;

public class GenerateAllTheSubsequences
{
    public static void allSubsequences(int i,int[]arr,ArrayList<Integer>res)
    {
        int n=arr.length;
        if(i>=n){
            System.out.println(res);
            return;
        }
        res.add(arr[i]);
        allSubsequences(i+1, arr, res);
        res.remove(res.size()-1);
        allSubsequences(i+1, arr, res);
    }


    public static void main(String[] args)
    {
        int arr[]={3,1,2};
        allSubsequences(0,arr,new ArrayList<>());
    }
}
package Recursion;

import java.util.ArrayList;

public class PrintAllTheSubSequencesWhoseSumIsK
{
    public static void subSeqSumK(int i,int arr[], int sum, ArrayList<Integer> res,int curr)
    {
        int n=arr.length;
        if(i==n){
            if(curr==sum){
                System.out.println(res);
            }
            return;
        }
        res.add(arr[i]);
        curr+=arr[i];

        subSeqSumK(i+1, arr, sum, res, curr);
        res.remove(res.size()-1);
        curr-=arr[i];
        subSeqSumK(i+1, arr, sum, res, curr);
    }

    public static void main(String[] args)
    {
        int arr[]={10,1,2,7,6,1,5};
        subSeqSumK(0,arr,8,new ArrayList<>(),0);

    }
}

package Recursion;

import java.util.ArrayList;

public class CountAllTheSubsequences
{
    public static int countAll(int i, int[]arr){
        if(i == arr.length){
            return 1;
        }
        int include=countAll(i+1, arr);
        int exclude=countAll(i+1, arr);

        return include+exclude;
    }

    public static void main(String[] args)
    {
        int arr[]={3,1,2};
        System.out.println(countAll(0,arr));

    }
}

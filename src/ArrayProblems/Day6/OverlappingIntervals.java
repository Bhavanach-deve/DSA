//Given an array of intervals arr[][] of size n, where arr[i] = [starti, endi] represents the start and end points of the ith interval, merge all overlapping intervals and return the resulting array of non-overlapping intervals.
//Note: Two intervals [a, b] and [c, d] such that a ≤ c, are considered overlapping if  c ≤ b.
package ArrayProblems.Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals
{
    public static ArrayList<ArrayList<Integer>>mergeOverlap(int [][]intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++)
        {
            if(intervals[i][0] <= end)
            {
                end = Math.max(end, intervals[i][1]);
            }
            else
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                ans.add(temp);

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        ans.add(temp);

        return ans;
}
    public static int[][]merge(int arr[][])
    {
        int n=arr.length;
        int m=arr[0].length;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ans=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<n;i++){
            if(arr[i][0]<=end){
                end=Math.max(end,arr[i][1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args)
    {
        int arr[][]={{1,2},{2,4},{6,8},{9,10}};
        ArrayList<ArrayList<Integer>>res=mergeOverlap(arr);
        System.out.println(res);
        int ans[][]=merge(arr);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

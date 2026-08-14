//Geek has an array of non-overlapping intervals intervals[][] where intervals[i] = [starti , endi] represent the start and the end of the ith event and intervals is sorted in ascending order by starti . He wants to add a new interval newInterval[] = [newStart, newEnd] where newStart and newEnd represent the start and end of this interval.
//Input: intervals[][] = [[1, 3], [4, 5], [6, 7], [8, 10]], newInterval[] = [5, 6]
//Output: [[1, 3], [4, 7], [8, 10]]
//Explanation: The newInterval [5, 6] overlaps with [4, 5] and [6, 7]. So, they are merged into one interval [4, 7].
package ArrayProblems.Day6;

import java.util.ArrayList;

public class InsertIntervals
{
    public static ArrayList<int[]>insertInterval(int[][]intervals,int[] newInterval)
    {
        ArrayList<int[]>ans=new ArrayList<>();

        int i=0;
        int n= intervals.length;
        int start=newInterval[0];
        int end=newInterval[1];
        //Add intervals that are completely before newINterval
        while(i<n && intervals[i][1]<start){
            ans.add(intervals[i]);
            i++;
        }
        //Merge overlapping intervals
        while(i<n&&intervals[i][0]<=end){
            start=Math.min(start,intervals[i][0]);
            end=Math.max(end,intervals[i][1]);

            i++;
        }
        //Add the merged
        ans.add(new int[]{start,end});
        //add remaining intervals
        while(i<n){
            ans.add(intervals[i]);
            i++;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int intervals[][]={{1,3},{4,5},{6,7},{8,10}};
        int newInterval[]={5,6};
        ArrayList<int[]>res=insertInterval(intervals,newInterval);
        for(int answer[]:res){
            System.out.print("["+answer[0]+","+answer[1]+"]");
        }

    }
}

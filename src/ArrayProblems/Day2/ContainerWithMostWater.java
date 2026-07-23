//Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis.
package ArrayProblems.Day2;

public class ContainerWithMostWater
{
    public static int MaxWater(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        int area=0;
        int MaxArea=Integer.MIN_VALUE;
        while(i<j)
        {
            if(arr[i]<arr[j]){
                int height=Math.min(arr[i],arr[j]);
                int width=j-i;
                area=height*width;
                MaxArea=Math.max(MaxArea,area);
                i++;
            }
            else{
                int height=Math.min(arr[i],arr[j]);
                int width=j-i;
                area=height*width;
                MaxArea=Math.max(MaxArea,area);
                j--;
            }
        }
        return MaxArea;
    }

    public static void main(String[] args)
    {
        int arr[]={3,1,2,4,5};
        System.out.println(MaxWater(arr));
    }

}

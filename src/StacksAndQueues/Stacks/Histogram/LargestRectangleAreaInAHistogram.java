//Given a histogram represented by an array arr[], where each element of the array denotes the height of the bars in the histogram. All bars have the same width of 1 unit.
//
//Find the largest rectangular area possible in the given histogram, where the rectangle can be formed using a number of contiguous bars.
package StacksAndQueues.Stacks.Histogram;

import java.util.Stack;

public class LargestRectangleAreaInAHistogram
{
    public static int largetRectangleArea(int[]heights){
        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int index=st.pop();
                int height=heights[index];

                int pse=st.isEmpty()?-1:st.peek();
                int nse=i;

                int width=nse-pse-1;
                int area=height*width;

                maxArea=Math.max(maxArea,area);
            }
            st.push(i);
        }
        //process the remaining bars if present in stack
        while(!st.isEmpty()){
            int index=st.pop();
            int height=heights[index];

            int pse=st.isEmpty()?-1:st.peek();
            int nse=n;

            int width=nse-pse-1;
            int area=height*width;

            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }


    public static void main(String[] args)
    {
        int arr[]={60,20,50,40,10,50,60};
        System.out.println(largetRectangleArea(arr));

    }
}

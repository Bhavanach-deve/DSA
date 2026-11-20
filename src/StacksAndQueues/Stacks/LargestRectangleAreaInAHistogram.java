package StacksAndQueues.Stacks;

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

package StacksAndQueues.Stacks.Histogram;

import java.util.Stack;

public class MaximalRectangleInAMatrix
{
    public static int maximalRectangle(int[][] matrix)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int prefix[]=new int[m];
        int maxArea=0;
        for(int j=0;j<n;j++){

            for(int i=0;i<m;i++){

                if(matrix[j][i]==1){
                    prefix[i]++;
                }else{
                    prefix[i]=0;
                }
            }
            maxArea=Math.max(maxArea,maxAreaInHistogram(prefix));
        }
        return maxArea;
    }
    public static int maxAreaInHistogram(int[]heights)
    {
        Stack<Integer> st=new Stack<>();
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
        int [][]matrix={{1,0,1,0,1},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        System.out.println(maximalRectangle(matrix));

    }
}

package StacksAndQueues.Stacks;

import java.util.Stack;

public class SumOfAllSubArrayMinimums
{
    public static int sumSubofSubArrayMins(int[] arr)
    {
        int n=arr.length;
        int[]pse=new int[n];
        int []nse=new int[n];
        Stack<Integer>st=new Stack<>();
        //previous smaller or equal
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        //Next strictly smaller
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            sum+=arr[i]*left*right;
        }
        return sum;
    }


    public static void main(String[] args)
    {
        int arr[]={10,20};
        System.out.println(sumSubofSubArrayMins(arr));

    }
}

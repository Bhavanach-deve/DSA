package StacksAndQueues.Stacks.MonotonicStacks;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallestElement
{
    public ArrayList<Integer>nearestSmallest(int arr[]){
        int n=arr.length;
        int[]nse=new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int res:nse){
            ans.add(res);
        }
        return ans;
    }

    public static void main(String[] args) {

        NearestSmallestElement nse=new NearestSmallestElement();
        int arr[]={5,7,9,6,7,4,5,1,3,7};
        System.out.println("Nearest Smallest Element: ");
        System.out.println(nse.nearestSmallest(arr));

    }
}

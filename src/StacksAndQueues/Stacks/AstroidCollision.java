//Given an array arr[] , return the final array by repeatedly apply the following operation from left to right until no more valid operations can be performed.
//
//If two adjacent elements have opposite signs:
//
//If their absolute values are different, remove both elements and insert the one with the greater absolute value, preserving its sign.
//If their absolute values are equal, remove both elements without inserting any new element.

package StacksAndQueues.Stacks;

import java.util.ArrayList;
import java.util.Stack;

import static java.lang.Math.abs;

public class AstroidCollision
{
    public ArrayList<Integer>oppositeSignPairReduction(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            boolean alive=true;

            while(alive && !st.isEmpty() && ((st.peek()>0 && curr<0)||(st.peek()<0&&curr>0))){
                long topAbs=Math.abs((long)st.peek());
                long currAbs=Math.abs((long)curr);

                if(topAbs<currAbs){
                    st.pop();
                }else if(topAbs==currAbs){
                    st.pop();
                    alive=false;
                }else{
                    alive=false;
                }
            }if(alive){
                st.push(curr);
            }
        }
        while(!st.isEmpty()){
            res.add(0,st.pop());
        }
        return res;
    }


    public static void main(String[] args)
    {
        int arr[]={4,7,1,1,2,-3,-7,17,15,-16};
        AstroidCollision obj = new AstroidCollision();
        System.out.println(obj.oppositeSignPairReduction(arr));

    }
}

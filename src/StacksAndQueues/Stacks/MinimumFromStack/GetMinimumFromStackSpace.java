package StacksAndQueues.Stacks.MinimumFromStack;

import java.util.Stack;
import java.util.*;

public class GetMinimumFromStackSpace
{
    private Stack<Long>stack;
    private long min;
    public GetMinimumFromStackSpace()
    {
        stack = new Stack<>();
    }
    public void push(int value){
        long val=(long)value;
        if(stack.isEmpty()){
            stack.push(val);
            min=val;
        }
        else{
            if(value>=min){
                stack.push(val);
            }else{
                stack.push(2*val-min);
                min=val;
            }
        }
    }
    public int pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        long n=stack.pop();

        if(n>=min){
            return (int)min;
        }else{
            long originalVal=min;
            min=2*min-n;
            return (int)originalVal;
        }

    }
    public  int top(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        long topVal=stack.peek();
        if(topVal>=min) {
            return (int)topVal;
        }else {
            return (int)min;
        }
    }
    public int getMinimum(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return(int) min;
    }

    public static void main(String[] args)
    {
        GetMinimumFromStackSpace obj=new GetMinimumFromStackSpace();
        obj.push(12);
        obj.push(15);
        obj.push(10);
        System.out.println("Top element: "+obj.top());
        System.out.println("Minimum value till now: "+obj.getMinimum());
        System.out.println("Popped: "+obj.pop());
        System.out.println("Top element: "+obj.top());
        System.out.println("Minimum value after a pop() operation: "+obj.getMinimum());
        System.out.println("Top after the pop: "+obj.top());


    }
}

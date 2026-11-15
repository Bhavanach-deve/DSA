package StacksAndQueues.Stacks.MinimumFromStack;

import java.util.Stack;

public class GetMinfromStack {
    class Pair{
        int value;
        int min;
        public Pair(int value, int min){
            this.value=value;
            this.min=min;
        }
    }
    private Stack<Pair> stack;

    public GetMinfromStack(){
        stack=new Stack<>();
    }

    public void push(int value){
        if(stack.isEmpty()){
            stack.push(new Pair(value,value));
        }else {
            int currMin = Math.min(value, stack.peek().min);
            stack.push(new Pair(value, currMin));
        }
    }
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.pop().value;
    }
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek().value;
    }
    public int getMin()
    {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek().min;
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

   public static void main(String[] args)
   {
       GetMinfromStack obj = new GetMinfromStack();
       obj.push(5);
       obj.push(3);
       obj.push(7);
       System.out.println("Current minimum: "+obj.getMin());

       obj.push(2);
       System.out.println("Current minimum: "+obj.getMin());

       obj.pop();
       System.out.println("Current minimum: "+obj.getMin());
       System.out.println("Top element: "+obj.peek());

    }
}

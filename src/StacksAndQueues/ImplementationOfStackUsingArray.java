package StacksAndQueues;

class ArrayStack{
    int []arr;
    int top=-1;
    int capacity;
    //Constructor initialize the stack
    public ArrayStack(int size){
        capacity=size;
        arr=new int[capacity];
        top=-1;
    }
    //insert an element
    public void push(int val){
        if(top==capacity-1){
            System.out.println("Stack is full");
            return;
        }
        top=top+1;
        arr[top]=val;
    }
    //remove and return the top element
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        int removed=arr[top];
        top=top-1;
        return removed;
    }
    //view top element without removing
    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
    public void printStack(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
public class ImplementationOfStackUsingArray
{
    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        System.out.println();
        stack.peek();
        stack.printStack();
        System.out.println();
        stack.pop();
        stack.printStack();
        System.out.println();
        stack.peek();
        stack.printStack();

    }
}

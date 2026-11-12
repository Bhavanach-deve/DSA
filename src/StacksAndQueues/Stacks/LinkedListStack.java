package StacksAndQueues.Stacks;

public class LinkedListStack
{
    static class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }
    Node top=null;
    int count=0;
    //push at head
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = top;
        top=newNode;
        count=count+1;
    }
    //pop from head
    public int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int removed=top.data;
        top=top.next;
        count=count-1;
        return removed;
    }
    public int peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int size(){
        return count;
    }
    public void printStack(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        System.out.println();
        stack.pop();
        System.out.println();
        stack.printStack();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println(stack.size()+" is the size of the stack");


    }
}

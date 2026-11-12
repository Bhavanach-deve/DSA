package StacksAndQueues.Queues;

class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    int count;
    int capacity;
    public CircularQueue(int size) {
        this.capacity = size;
        arr = new int[size];
        front = 0;
        rear = -1;
        count=0;
    }
    public void push(int val){
        if(count==capacity){
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%capacity;
        arr[rear]=val;
        count++;
    }
    public int pop(){
        if(count==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int remove=arr[front];
        front=(front+1)%capacity;
        count--;
        return remove;
    }
    public int peek(){
        if(count==0){
            System.out.println("Queue is empty");
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return count==0;
    }
    public int size(){
        return count;
    }
    public void print(){
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class ImplementationOfQueuesUsingArray
{
    public static void main(String[] args)
    {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.push(1);
        circularQueue.push(2);
        circularQueue.push(3);
        circularQueue.push(4);
        circularQueue.push(5);
        circularQueue.print();
        System.out.println("The 1st element is "+circularQueue.peek());
        circularQueue.pop();
        System.out.println("The 1nd element now is "+circularQueue.peek());


    }
}

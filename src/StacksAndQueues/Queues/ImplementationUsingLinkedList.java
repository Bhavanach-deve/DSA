package StacksAndQueues.Queues;

public class ImplementationUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;
    int count = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
    }

    public int pop() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        count--;
        if (front == null) {
            rear = null;
        }
        return removed;

    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return count;
    }
    public void print(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ImplementationUsingLinkedList list = new ImplementationUsingLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.print();
        System.out.println();
        System.out.println("The 1st element is: "+list.peek());
        list.pop();
        System.out.println();
        System.out.println("The 1st element after the pop is: "+list.peek());
    }
}

//You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.
package LinkedListProblems.LLCreation.Day3;
class Node
{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DetectLoopInLinkedList1
{
    public static boolean detectLoop(Node head)
    {
        if(head==null){
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Node n=new Node(1);
        n.next=new Node(2);
        n.next.next=new Node(3);
        //cycle creation
        n.next.next.next=n.next.next;
        System.out.println("Loop exist ?: "+detectLoop(n));
    }
}

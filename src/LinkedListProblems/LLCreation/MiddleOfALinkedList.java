//You are given the head of a linked list, You have to return the value of the middle node of the linked list.
//
//If the number of nodes is odd, return the middle node value.
//If the number of nodes is even, there are two middle nodes, so return the second middle node value.
package LinkedListProblems.LLCreation;

class Nodee
{
    int data;
    Nodee next;
    public Nodee(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class MiddleOfALinkedList
{
    public static Nodee getMiddle(Nodee head)
    {
        Nodee slow=head;
        Nodee fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args)
    {
        Nodee n=new Nodee(1);
        n.next=new Nodee(2);
        n.next.next=new Nodee(3);
        n.next.next.next=new Nodee(4);
        n.next.next.next.next=new Nodee(5);
        Nodee middle=getMiddle(n);
        System.out.println("Middle element: "+middle.data);


    }
}

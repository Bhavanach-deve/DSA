//Given a singly linked list: A0 →A1 →...→An-2 →An-1 , reorder it to A0 →An-1 →A1 →An-2 →A2 →An-3 →...
//For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.
package LinkedListProblems.LLCreation.Day5;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReorderLinkedList
{
    public static void reorderList(Node head)
    {
        if(head==null || head.next==null){
            return;
        }
        //1.Find Middle
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //2.Split the list
        Node second=slow.next;
        slow.next=null;
        //3.Reverse secondhalf
        second=reverse(second);
        //4.Merge alternately
        Node first=head;
        while(second!=null){
            Node firstNext=first.next;
            Node secondNext=second.next;

            first.next=second;
            second.next=firstNext;

            first=firstNext;
            second=secondNext;
        }

    }
    public static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public static void printLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args)
    {
        Node n=new Node(1);
        n.next=new Node(2);
        n.next.next=new Node(3);
        n.next.next.next=new Node(4);
        n.next.next.next.next=new Node(5);
        n.next.next.next.next.next=new Node(6);
        printLL(n);
        reorderList(n);
        System.out.println();
        System.out.println("After reordering the LinkedList:");
        printLL(n);




    }
}

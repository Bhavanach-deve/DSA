//Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.
package LinkedListProblems.LLCreation.Day4;

class Nod{
    int data;
    Nod next;

    public Nod(int data){
        this.data=data;
        this.next=null;
    }
}

public class SortALinkedList
{
    public static Nod sortList(Nod head)
    {
        if(head==null || head.next==null){
            return head;
        }
        Nod slow=head;
        Nod fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Nod second=slow.next;
        slow.next=null;

        Nod left=sortList(head);
        Nod right=sortList(second);

        return mergeTwoLists(left,right);
    }
    public static Nod mergeTwoLists(Nod n1, Nod n2) {

        Nod prevHead = new Nod(-1);
        Nod prev = prevHead;

        while (n1 != null && n2 != null) {

            if (n1.data <= n2.data) {
                prev.next = n1;
                n1 = n1.next;
            } else {
                prev.next = n2;
                n2 = n2.next;
            }

            prev = prev.next;
        }

        prev.next = n1 == null ? n2 : n1;

        return prevHead.next;
    }

    public static void main(String[] args)
    {
        Nod n1=new Nod(4);
        n1.next=new Nod(2);
        n1.next.next=new Nod(1);
        n1.next.next.next=new Nod(3);
        Nod ans=sortList(n1);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }

}

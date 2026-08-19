//Given the head of a linked list and an integer k, return the kth node from the end of the linked list. If k is greater than the number of nodes in the list, return -1.
package LinkedListProblems.LLCreation;

class Nod{

    int data;
    Nod next;
    public Nod(int data)
    {
        this.data=data;
        this.next=null;
    }

}

public class KthNodeFromTheEndOfTheLinkedList
{
    public static int gettheKthFromEnd(Nod head,int k)
    {
        Nod first=head;
        Nod second=head;
        for(int i=0;i<k;i++){
            if(first==null){
                return -1;
            }
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        return second.data;
    }

    public static void main(String[] args)
    {
        Nod n=new Nod(1);
        n.next=new Nod(2);
        n.next.next=new Nod(3);
        n.next.next.next=new Nod(4);
        n.next.next.next.next=new Nod(5);
        n.next.next.next.next.next=new Nod(6);
        n.next.next.next.next.next.next=new Nod(7);
        n.next.next.next.next.next.next.next=new Nod(8);
        int res=gettheKthFromEnd(n,3);
        System.out.println(res);

    }
}

//Given the head of a linked list and an integer x, rearrange the list such that:
//All nodes with values less than x appear first,
//Followed by nodes with values equal to x,
//Followed by nodes with values greater than x.
//The relative order of nodes within each partition must remain unchanged, and the rearrangement should be performed in-place.
package LinkedListProblems.LLCreation.Day5;

class Nodes
{
    int data;
    Nodes next;
    public Nodes(int data){
        this.data=data;
        this.next=null;
    }
}
public class PartitionALinkedList
{
    public static Nodes partition(Nodes head,int x)
    {
        Nodes greaterHead=new Nodes(-1);
        Nodes lessHead=new Nodes(-1);
        Nodes equalHead=new Nodes(-1);

        Nodes less=lessHead;
        Nodes equal=equalHead;
        Nodes greater=greaterHead;

        Nodes curr=head;
        while(curr!=null){
            Nodes next=curr.next;
            curr.next=null;
            if(curr.data<x){
                less.next=curr;
                less=less.next;
            }else if(curr.data==x){
                equal.next=curr;
                equal=equal.next;
            }
            else{
                greater.next=curr;
                greater=greater.next;
            }
            curr=next;
        }
        less.next=equalHead.next;
        if(equalHead.next!=null){
            equal.next=greaterHead.next;
        }
        return lessHead.next;
    }


    public static void main(String[] args)
    {
        Nodes n=new Nodes(1);
        n.next=new Nodes(4);
        n.next.next=new Nodes(3);
        n.next.next.next=new Nodes(2);
        n.next.next.next.next=new Nodes(5);
        n.next.next.next.next.next=new Nodes(2);
        n.next.next.next.next.next.next=new Nodes(3);

        Nodes ans=partition(n,3);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}

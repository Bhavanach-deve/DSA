//Delete Nth node from the end of the given linked list
package LinkedListProblems.LLCreation.Day2;

class Nody
{
    int data;
    Nody next;
    public Nody(int data){
        this.data=data;
        this.next=null;
    }
}

public class DeleteTheNthNodeFromEnd
{
    public static Nody deleteNth(Nody head,int n)
    {
        Nody dummy=new Nody(0);
        dummy.next=head;

        Nody slow=dummy;
        Nody fast=dummy;

        for(int i=0;i<=n;i++){
            if(fast==null){
                return head;
            }
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        Nody deletedNode=slow.next;
        if(deletedNode!=null){
            slow.next=deletedNode.next;
        }
        return dummy.next;
    }
    public static void printLL(Nody head)
    {
        Nody curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args)
    {
        Nody n=new Nody(1);
        n.next=new Nody(2);
        n.next.next=new Nody(3);
        n.next.next.next=new Nody(4);
        n.next.next.next.next=new Nody(5);
        n=deleteNth(n,2);
        printLL(n);

    }
}

package LinkedListProblems.LLCreation.Day5;

class Nodde{
    Nodde next;
    int data;
    public Nodde(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseKGroup
{
    public static Nodde reverseKGroup(Nodde head,int k)
    {
        if(head==null || k<=1)
            return head;

        Nodde dummy=new Nodde(-1);
        dummy.next=head;

        Nodde groupPrev=dummy;

        while(true){
            //Find the kth node
            Nodde kth=groupPrev;
            for(int i=0;i<k;i++){
                kth=kth.next;
                if(kth==null){
                    return dummy.next;
                }
            }
            Nodde groupNext=kth.next;
            //Reverse current group
            Nodde prev=groupNext;
            Nodde curr=groupPrev.next;

            while(curr!=groupNext){
                Nodde next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            //Connect previous part to the reversed group
            Nodde oldGroupStart=groupPrev.next;
            groupPrev.next=kth;
            //Old group start is now the end
            groupPrev=oldGroupStart;
        }

    }

    public static void main(String[] args)
    {
        Nodde n=new Nodde(1);
        n.next=new Nodde(2);
        n.next.next=new Nodde(3);
        n.next.next.next=new Nodde(4);
        n.next.next.next.next=new Nodde(5);
        int k=2;
        Nodde ans=reverseKGroup(n,k);
        while(ans!=null)
        {
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}

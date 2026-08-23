//You are given the head of a singly linked list, you have to left rotate the linked list k times. Return the head of the modified linked list.
package LinkedListProblems.LLCreation.Day5;

class Nod{
    int data;
    Nod next;
    public Nod(int data){
        this.data=data;
        this.next=null;
    }
}

public class RotateALinkedList
{
    public static Nod rotate(Nod head,int k)
    {
        if(k==0 || head==null){
            return head;
        }
        for(int i=0;i<k;i++){
            Nod curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=head;
            curr=curr.next;
            head=head.next;
            curr.next=null;
        }
        return head;
    }
    public static Nod rotateOptimized(Nod head,int k)
    {
        if(head==null||head.next==null||k==0){
            return head;
        }
        //find length and tail
        int length=1;
        Nod tail=head;

        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        k=k%length;

        if(k==0){
            return head;
        }
        //find new tail
        Nod newTail=head;

        for(int i=1;i<k;i++){
            newTail=newTail.next;
        }
        //New head is after new tail
        Nod newHead=newTail.next;
        //Break the list
        newTail.next=null;
        //Attach old beginning to old tail
        tail.next=head;

        return newHead;
    }
    public static void print(Nod n){
        Nod curr=n;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args)
    {
        Nod n=new Nod(10);
        n.next=new Nod(20);
        n.next.next=new Nod(30);
        n.next.next.next=new Nod(40);

        n=rotate(n,2);
        print(n);
        System.out.println();
        Nod n1=new Nod(10);
        n1.next=new Nod(20);
        n1.next.next=new Nod(30);
        n1.next.next.next=new Nod(40);
        n1.next.next.next.next=new Nod(50);
        rotateOptimized(n1,4);
        print(n);

    }
}

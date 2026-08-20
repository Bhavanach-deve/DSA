//You are given the head of a singly linked list. If a loop is present in the linked list then return the first node of the loop else return -1.
package LinkedListProblems.LLCreation.Day3;

class Nodes
{
    int data;
    Nodes next;
    public Nodes(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class FindTheStartingPointOfTheCycle
{
    public static int cycleStar(Nodes head)
    {
        if(head==null){
            return -1;
        }
        Nodes slow=head;
        Nodes fast=head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Nodes entry=head;

                while(entry!=slow)
                {
                entry=entry.next;
                slow=slow.next;
                }
                return entry.data;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Nodes n=new Nodes(1);
        n.next=new Nodes(2);
        n.next.next=new Nodes(3);
        n.next.next.next=new Nodes(4);
        n.next.next.next.next=new Nodes(5);
        n.next.next.next.next.next=n.next.next;
        System.out.println("First Nodes values: "+cycleStar(n));


    }
}

//Given the head of a sorted singly linked list, remove all duplicate nodes so that each element appears only once. The resulting linked list should remain sorted.
//Note: Try to solve the problem without using extra space.

package LinkedListProblems.LLCreation.Day4;

class Nodes
{
    Nodes next;
    int data;

    public Nodes(int data){
        this.data=data;
        this.next=null;
    }

}

public class RemoveDuplicatesFromASortedLinkedList
{
    public static Nodes removeDuplicates(Nodes head)
    {
        Nodes current=head;

        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }

    public static void main(String[] args)
    {
        Nodes n=new Nodes(2);
        n.next=new Nodes(2);
        n.next.next=new Nodes(4);
        n.next.next.next=new Nodes(5);
        Nodes ans=removeDuplicates(n);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}

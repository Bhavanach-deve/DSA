//Given a head of an unsorted linked list. Remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all other duplicates are to be removed.
package LinkedListProblems.LLCreation.Day4;

import java.util.HashSet;

class Nodee{
    Nodee next;
    int data;
    public Nodee(int data){
        this.data=data;
        this.next=null;
    }
}

public class RemoveDuplicatesFromUnsortedLinkedList
{
    public static Nodee removeDuplicates(Nodee head)
    {
        HashSet<Integer> set=new HashSet<>();
        Nodee current=head;
        Nodee prev=null;
        while(current!=null){
            if(set.contains(current.data)){
                prev.next=current.next;

            }else{
                set.add(current.data);
                prev=current;
            }
            current=current.next;
        }
        return head;
    }

    public static void main(String[] args)
    {
        Nodee n=new Nodee(5);
        n.next=new Nodee(2);
        n.next.next=new Nodee(2);
        n.next.next.next=new Nodee(4);
        Nodee ans=removeDuplicates(n);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }

    }
}

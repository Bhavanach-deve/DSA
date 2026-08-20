//You are given the head of a singly linked list of positive integers. You have to check if the given linked list is palindrome or not.
package LinkedListProblems.LLCreation.Day3;

class Nod{
    int data;
    Nod next;
    public Nod(int data){
        this.data=data;
        this.next=null;
    }
}
public class PalindromeLinkedList
{
    public static boolean isPalindrome(Nod head)
    {
        if(head==null || head.next==null){
            return true;
        }
        Nod mid=getMiddle(head);
        Nod secondHalf=reverse(mid.next);

        Nod firstHalf=head;
        Nod temp=secondHalf;

        while(temp!=null){
            if(firstHalf.data!=temp.data){
                return false;
            }
            firstHalf=firstHalf.next;
            temp=temp.next;
        }
        return true;
    }
    public static Nod getMiddle(Nod head){
        Nod slow=head;
        Nod fast=head;
        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Nod reverse(Nod head){
        Nod prev=null;
        Nod curr=head;
        while(curr!=null){
            Nod next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        Nod n=new Nod(1);
        n.next=new Nod(2);
        n.next.next=new Nod(1);
        n.next.next.next=new Nod(1);
        n.next.next.next.next=new Nod(2);
        n.next.next.next.next.next=new Nod(1);
        boolean ans=isPalindrome(n);
        System.out.println(ans);

    }
}

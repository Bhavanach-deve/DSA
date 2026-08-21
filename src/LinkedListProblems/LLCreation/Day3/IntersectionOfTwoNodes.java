//Given the heads of two non-empty singly linked lists, head1 and head2, return the node where the two linked lists intersect. It is guaranteed that an intersection always exists.
//Note: The custom input contains a non-empty list common. Initially, head1 and head2 do not share any node. The last node of each list is then connected to the head of common, creating an intersection at the first node of common.
package LinkedListProblems.LLCreation.Day3;

class No{
    No next;
    int data;

    public No(int data){
        this.data=data;
        this.next=null;
    }
}


public class IntersectionOfTwoNodes
{
    public static No intersectPoint(No head1,No head2)
    {
        No p1=head1;
        No p2=head2;
        while(p1!=p2){
            if(p1==null){
                p1=head2;
            }else{
                p1=p1.next;
            }
            if(p2==null){
                p2=head1;
            }else{
                p2=p2.next;
            }
        }
        return p1;
    }

    public static void main(String[] args)
    {
        No common=new No(7);
        common.next=new No(8);
        
        No n1=new No(1);
        n1.next=new No(2);
        n1.next.next=new No(3);
        n1.next.next.next=common;


        No n2=new No(4);
        n2.next=new No(5);
        n2.next.next=common;
        No ans=intersectPoint(n1,n2);
        System.out.println(ans.data);
    }

}

//Given an array arr[] of n sorted linked lists of different sizes. Your task is to merge all these lists into a single sorted linked list and return the head of the merged list.
package LinkedListProblems.LLCreation.Day4;

class Node{
    Node next;
    int data;
    public Node(int data){
        this.data=data;
    }
}

public class MergeKSortedLinkedList
{
    public static Node mergeKSorted(Node arr[])
    {
        if(arr.length==0){
            return null;
        }
        Node result=arr[0];
        for(int i=1;i<arr.length;i++){
            result=mergeTwoLists(result,arr[i]);
        }
        return result;
    }

    public static Node mergeTwoLists(Node n1, Node n2)
    {
        Node prevHead=new Node(-1);
        Node prev=prevHead;

        while(n1!=null && n2!=null){
            if(n1.data<=n2.data){
                prev.next=n1;
                n1=n1.next;
            }else{
                prev.next=n2;
                n2=n2.next;
            }
            prev=prev.next;
        }
        prev.next=n1==null?n2:n1;
        return prevHead.next;
    }

   public static void main(String[] args)
   {
       Node n1=new Node(1);
       n1.next=new Node(3);
       n1.next.next=new Node(7);

       Node n2=new Node(2);
       n2.next=new Node(4);
       n2.next.next=new Node(8);

       Node n3=new Node(9);

       Node arr[]={n1,n2,n3};
       Node ans=mergeKSorted(arr);
       while(ans!=null){
           System.out.print(ans.data+" ");
           ans=ans.next;
       }

    }
}

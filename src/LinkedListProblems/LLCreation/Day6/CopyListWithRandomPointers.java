package LinkedListProblems.LLCreation.Day6;

import java.util.HashMap;

class Node{
    int data;
    Node next;
    Node random;

    public Node(int data){
        this.data=data;
        this.next=null;
        this.random=null;
    }
}

public class CopyListWithRandomPointers
{
    public static Node copyRandomList(Node head)
    {
        if(head==null)
            return null;
        HashMap<Node,Node> map=new HashMap<>();
        Node curr=head;
        while(curr!=null){
            map.put(curr,new Node(curr.data));
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            Node copy=map.get(curr);
            copy.next=map.get(curr.next);
            copy.random=map.get(curr.random);

            curr=curr.next;
        }
        return map.get(head);
    }

    public static void main(String[] args)
    {
        Node n=new Node(1);
        n.next=new Node(2);
        n.next.next=new Node(3);
        n.next.next.next=new Node(4);

        // Set random pointers
        n.random = n.next.next;                    // 1 → 3
        n.next.random = n;                         // 2 → 1
        n.next.next.random = n.next.next.next;     // 3 → 4
        n.next.next.next.random = n.next;          // 4 → 2

        Node ans=copyRandomList(n);

        Node temp = ans;

        while(temp != null){

            System.out.print("Node: " + temp.data);

            if(temp.random != null)
                System.out.println(" Random: " + temp.random.data);
            else
                System.out.println(" Random: null");

            temp = temp.next;
        }

    }
}

//Given the head of a singly linked list. Reverse the linked list and return the head of the reversed list.
package LinkedListProblems.LLCreation.Day2;

class Nodes {
    Nodes next;
    int data;

    public Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseALinkedList {
    public static Nodes reverseLinkedList(Nodes head) {
        Nodes prev = null;
        Nodes curr = head;

        while (curr != null) {
            Nodes next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printList(Nodes head) {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Nodes n = new Nodes(1);
        n.next = new Nodes(2);
        n.next.next = new Nodes(3);
        n.next.next.next = new Nodes(4);
        printList(n);
        n=reverseLinkedList(n);
        printList(n);

    }
}

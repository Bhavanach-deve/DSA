package LinkedListProblems.LLCreation;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Traversing a linkedList
    public void printLL(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // Inserting data at the beginning
    public void insertAtStart(Node data, Node head) {
        Node newNode = data;
        newNode.next = head;
        head = newNode;
    }

    // Inserting data at the end
    public void insertAtEnd(Node data, Node head) {
        Node newNode = data;
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Deleting the 1st Node
    public Node deleteFirst(Node head) {
        if (head == null)
            return null;

        return head.next;
    }

    // Deleting last Node
    public Node deleteLast(Node head) {

        // Empty linked list
        if (head == null) {
            return null;
        }

        // Only one node
        if (head.next == null) {
            return null;
        }

        Node current = head;

        // Move to second-last node
        while (current.next.next != null) {
            current = current.next;
        }

        // Remove last node
        current.next = null;

        return head;
    }

    // Length of the linked list
    public int lengthofLL(Node current) {

        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}

public class LinkedListImplementation {

    public static void main(String[] args) {

        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);

        System.out.println("LinkedList");
        n.printLL(n);

        // Insert at beginning
        Node newNode = new Node(0);
        n.insertAtStart(newNode, n);

        System.out.println();
        System.out.println("************************************");
        System.out.println("After inserting 0 at the beginning:");
        n.printLL(newNode);

        // Insert at end
        Node newEnd = new Node(5);
        n.insertAtEnd(newEnd, newNode);

        System.out.println();
        System.out.println("**************************************");
        System.out.println("After inserting data 5 at the end:");
        n.printLL(newNode);

        // Delete first
        newNode = n.deleteFirst(newNode);

        System.out.println();
        System.out.println("************************************");
        System.out.println("LinkedList after deleting data at the first:");
        n.printLL(newNode);

        // Delete last
        newNode = n.deleteLast(newNode);

        System.out.println();
        System.out.println("**************************************");
        System.out.println("LinkedList after deleting data at the last:");
        n.printLL(newNode);

        // Length
        System.out.println();
        System.out.println("********************************************");
        System.out.println("The length of the Linkedlist is: "
                + n.lengthofLL(newNode));
    }
}
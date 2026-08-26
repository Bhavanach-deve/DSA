package LinkedListProblems.LLCreation.Day6;

public class LinkedListUsingArray {

    int[] data;
    int[] next;

    int head = -1;
    int size = 0;

    public LinkedListUsingArray(int capacity) {

        data = new int[capacity];
        next = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            next[i] = -1;
        }
    }

    public void add(int value) {

        if (size == data.length) {
            System.out.println("List is full");
            return;
        }

        int index = size;

        data[index] = value;
        next[index] = -1;

        if (head == -1) {
            head = index;
        } else {

            int current = head;

            while (next[current] != -1) {
                current = next[current];
            }

            next[current] = index;
        }

        size++;
    }

    public void print() {

        int current = head;

        while (current != -1) {

            System.out.print(data[current] + " ");

            current = next[current];
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListUsingArray list =
                new LinkedListUsingArray(5);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.print();
    }
}

package StacksAndQueues.Stacks;

import java.util.HashMap;

public class LRUCache
{
    class Node{
        int  key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private HashMap<Integer,Node> map;
    private Node head;
    private Node tail;
    private int capacity;

    public LRUCache(int capacity)
    {
        this.capacity = capacity;
        map=new HashMap<Integer,Node>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    // Insert node immediately after head (MRU position)
    private void  addNode(Node node){
        node.next=head.next;
        node.prev=head;

        head.next.prev=node;
        head.next=node;

    }
    // Remove a node from its current position
    private void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    // Move an existing node to the front
    private void moveToFront(Node node){
        removeNode(node);
        addNode(node);
    }
    // GET
    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        moveToFront(node);
        return node.value;
    }
    // PUT
    public void put(int key,int value){
        if(capacity==0){
            return;
        }
        // key already exists
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            moveToFront(node);
            return;
        }
        //Cache is full: evict LRU
        if(map.size()==capacity){
            Node lru=tail.prev;
            removeNode(lru);
            map.remove(lru.key);
        }
        //Insert the new node
        Node newNode=new Node(key,value);
        addNode(newNode);
        map.put(key,newNode);
    }
    //print Cache
    public void printCache(){
        Node current=head.next;
        if(current==null){
            System.out.println("Empty Cache");
            return;
        }
        System.out.println("MRU->");
        while(current!=null){
            System.out.println("("+current.key+","+current.value+")");
            current=current.next;

            if(current==null){
                System.out.println("->");
            }
        }
        System.out.println(" -> LRU" );
    }

    public static void main(String[] args)
    {
        LRUCache cache=new LRUCache(4);
        System.out.println("Initial Cache: Empty");
        cache.put(2,6);
        cache.put(4,7);
        cache.put(8,11);
        cache.put(7,10);
        cache.printCache();
        int r=cache.get(2);
        System.out.println("Get(2) returns: "+r);
        int r1=cache.get(8);
        cache.printCache();
        System.out.println("Get(8) returns: "+r1);
        cache.printCache();
        System.out.println("\nBefore PUT(40, 400):");
        cache.printCache();
        cache.put(5,6);
        System.out.println("After PUT(40, 400):");
        cache.printCache();
        cache.get(7);
        cache.printCache();
        System.out.println("Before PUT(5, 7):");
        cache.printCache();

        cache.put(5,7);
        System.out.println("After PUT(5, 7):");

    }

}

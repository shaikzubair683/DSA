package LinkedLists;

public class MyLinkedList {
    private Node head;
    private int size;

    // internally we need to maintain a static class Node to create nodes, we wont
    // expose it. We only expose the addlast, add, remove methods
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node index = head;
        if (index != null) {
            while (index.next != null) {
                index = index.next;
            }
        } else {
            head = newNode;
        }
        index.next = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
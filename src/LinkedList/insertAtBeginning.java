/*
 * This class demonstrates inserting a node
 * at the beginning of a singly linked list.
 */

class insertAtBeginning {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Method to insert at beginning
    static void insert(int data) {
        Node newNode = new Node(data);

        // New node points to current head
        newNode.next = head;

        // Head updated to new node
        head = newNode;
    }

    // Method to display list
    static void display() {
        Node temp = head;

        // Traverse the list
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insert(30);
        insert(20);
        insert(10);
        display();
    }
}

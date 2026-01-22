/*
 * This class demonstrates deleting a node
 * from a singly linked list by value.
 */

class deleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    static void delete(int key) {

        // If head needs to be deleted
        if (head != null && head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        // Search for the node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If node not found
        if (current == null)
            return;

        // Remove node
        prev.next = current.next;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        delete(20);
        display();
    }
}

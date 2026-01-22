/*
 * This class removes duplicate elements
 * from a sorted singly linked list.
 */

class removeDuplicates {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    static void removeDuplicates() {
        Node temp = head;

        // Traverse list
        while (temp != null && temp.next != null) {

            // If duplicate found
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
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
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);

        removeDuplicates();
        display();
    }
}

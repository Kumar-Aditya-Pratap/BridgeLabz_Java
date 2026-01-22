/*
 * This class demonstrates searching an element
 * in a singly linked list.
 */

class searchElement {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    static void search(int key) {
        Node temp = head;

        // Traverse list
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        head = new Node(5);
        head.next = new Node(15);
        head.next.next = new Node(25);

        search(15);
    }
}

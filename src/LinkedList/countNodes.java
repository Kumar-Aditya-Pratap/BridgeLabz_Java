/*
 * This class counts the number of nodes
 * in a singly linked list.
 */

class countNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    static int count() {
        int count = 0;
        Node temp = head;

        // Traverse list
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("Total nodes: " + count());
    }
}

/*
 * This class implements a Queue using two Stacks.
 * Enqueue operation is done using first stack
 * and dequeue operation uses second stack.
 */

import java.util.Stack;

class queueUsingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation
    void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue operation
    int dequeue() {

        // If both stacks are empty
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Transfer elements if s2 is empty
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public static void main(String[] args) {
        queueUsingStacks q = new queueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

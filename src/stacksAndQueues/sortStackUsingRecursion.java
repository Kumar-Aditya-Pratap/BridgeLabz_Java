/*
 * This class sorts a stack using recursion.
 * No extra data structure is used.
 */

import java.util.Stack;

class sortStackUsingRecursion {

    // Method to insert element in sorted order
    static void sortedInsert(Stack<Integer> stack, int value) {

        // Base condition
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        sortedInsert(stack, value);
        stack.push(temp);
    }

    // Method to sort stack
    static void sortStack(Stack<Integer> stack) {

        // Base condition
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(20);

        sortStack(stack);

        System.out.println(stack);
    }
}

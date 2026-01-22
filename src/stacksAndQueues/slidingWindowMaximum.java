/*
 * This class finds maximum element in each
 * sliding window of size k using Deque.
 */

import java.util.Deque;
import java.util.LinkedList;

class slidingWindowMaximum {

    static void findMax(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove elements out of window
            if (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            // Print max after window is formed
            if (i >= k - 1) {
                System.out.print(arr[dq.peek()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        findMax(arr, 3);
    }
}

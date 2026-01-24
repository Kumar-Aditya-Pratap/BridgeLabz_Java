/*
 * This class demonstrates Bubble Sort algorithm.
 * Bubble Sort repeatedly compares adjacent elements
 * and swaps them if they are in the wrong order.
 */

public class bubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};
        int n = arr.length;

        // Loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

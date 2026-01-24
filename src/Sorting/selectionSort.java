/*
 * This class demonstrates Selection Sort algorithm.
 * Selection Sort selects the minimum element from the
 * unsorted part and places it at the beginning.
 */

public class selectionSort {

    public static void main(String[] args) {

        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        // Loop through array
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

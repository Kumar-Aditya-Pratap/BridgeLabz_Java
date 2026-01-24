/*
 * This class demonstrates Insertion Sort algorithm.
 * Insertion Sort builds the sorted array one element
 * at a time by inserting elements at the correct position.
 */

public class insertionSort {

    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 5, 6 };

        // Loop from second element
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at correct position
            arr[j + 1] = key;
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

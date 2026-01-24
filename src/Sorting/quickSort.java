/*
 * This class demonstrates Quick Sort algorithm.
 * Quick Sort selects a pivot and partitions the array
 * around the pivot element.
 */

public class quickSort {

    // Method to partition array
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        // Rearrange elements around pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Recursive quick sort
    static void sort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            // Sort elements before partition
            sort(arr, low, pi - 1);

            // Sort elements after partition
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 10, 7, 8, 9, 1, 5 };

        sort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

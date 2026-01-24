/*
 * This class demonstrates Merge Sort algorithm.
 * Merge Sort uses divide and conquer technique
 * to divide the array and merge sorted halves.
 */

public class mergeSort {

    // Method to merge two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Recursive merge sort method
    static void sort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Sort first half
            sort(arr, left, mid);

            // Sort second half
            sort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

        sort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

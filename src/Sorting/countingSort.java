/*
 * This class demonstrates Counting Sort algorithm.
 * Counting Sort works efficiently when the range of
 * input values is small.
 */

public class countingSort {

    public static void main(String[] args) {

        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        int max = 8;

        int[] count = new int[max + 1];

        // Count frequency of each element
        for (int num : arr) {
            count[num]++;
        }

        int index = 0;

        // Reconstruct sorted array
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

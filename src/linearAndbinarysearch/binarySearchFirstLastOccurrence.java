/*
 * This class finds first and last occurrence
 * of an element in a sorted array.
 */

public class binarySearchFirstLastOccurrence {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 2, 3, 4 };
        int target = 2;

        int first = -1, last = -1;

        // Find first occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                first = i;
                break;
            }
        }

        // Find last occurrence
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                last = i;
                break;
            }
        }

        System.out.println("First: " + first + ", Last: " + last);
    }
}

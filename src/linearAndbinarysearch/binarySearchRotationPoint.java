/*
 * This class finds the rotation point in a rotated
 * sorted array using Binary Search.
 */

public class binarySearchRotationPoint {

    public static void main(String[] args) {

        int[] arr = { 15, 18, 2, 3, 6, 12 };
        int low = 0, high = arr.length - 1;

        // Binary search for rotation point
        while (low < high) {

            int mid = (low + high) / 2;

            // Check which half is unsorted
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println("Rotation point index: " + low);
    }
}

/*
 * This class finds a peak element in an array
 * using Binary Search approach.
 */

public class binarySearchPeakElement {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 20, 4, 1, 0 };
        int low = 0, high = arr.length - 1;

        // Binary search to find peak
        while (low < high) {

            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println("Peak element: " + arr[low]);
    }
}

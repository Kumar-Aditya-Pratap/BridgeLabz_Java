/*
 * This class demonstrates choosing between
 * Linear Search and Binary Search based on data.
 */

public class linearBinarySearchChallenge {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };
        int target = 6;

        // Binary search as array is sorted
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found");
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}

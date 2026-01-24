/*
 * This class compares Linear Search and Binary Search
 * and demonstrates their time complexity behavior.
 */
import java.util.Arrays;

public class linearVsBinarySearch {

    // Linear search method
    static int linearSearch(int[] arr, int target) {
        // Traverse array one by one
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary search method
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        // Continue until search space is exhausted
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};

        // Sort array before binary search
        Arrays.sort(data);

        System.out.println("Linear Search Index: " + linearSearch(data, 40));
        System.out.println("Binary Search Index: " + binarySearch(data, 40));
    }
}

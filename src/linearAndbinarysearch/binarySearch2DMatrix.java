/*
 * This class searches an element in a 2D matrix
 * using Binary Search technique.
 */

public class binarySearch2DMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 3, 5 },
                { 7, 9, 11 },
                { 13, 15, 17 }
        };

        int target = 9;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0, high = rows * cols - 1;

        // Binary search on matrix
        while (low <= high) {

            int mid = (low + high) / 2;
            int value = matrix[mid / cols][mid % cols];

            if (value == target) {
                System.out.println("Element found");
                return;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}

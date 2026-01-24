
/*
 * This class compares Bubble Sort, Merge Sort, and Quick Sort
 * based on their time complexity characteristics.
 */
import java.util.Arrays;

public class sortingComparison {

    // Bubble sort implementation
    static void bubbleSort(int[] arr) {
        // Outer loop for passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for swapping
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = { 5, 3, 8, 4, 2 };

        // Using built-in sort (Merge/Quick internally)
        Arrays.sort(data);

        System.out.println("Sorted Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}

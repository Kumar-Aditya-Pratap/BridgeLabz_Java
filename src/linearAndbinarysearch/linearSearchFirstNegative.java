/*
 * This class finds the first negative number in an array
 * using Linear Search technique.
 */

public class linearSearchFirstNegative {

    public static void main(String[] args) {

        int[] arr = {5, 3, -4, 7, -1};

        // Loop through array elements
        for (int i = 0; i < arr.length; i++) {

            // Check for first negative element
            if (arr[i] < 0) {
                System.out.println("First negative number: " + arr[i]);
                return;
            }
        }

        System.out.println("No negative number found");
    }
}

package Arrays.Level2;

import java.util.Scanner;

/**
 * The LargestSecondLargestDynamic class extracts digits from an integer and
 * finds the two largest unique digits. It features a dynamic array resizing
 * mechanism that automatically increases the storage capacity if the number
 * of digits exceeds the current array size, similar to how an ArrayList works.
 */
class LargestSecondLargestDynamic {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read the integer from the user
        int number = input.nextInt();

        // Initial capacity of the array and the index tracker
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Process digits and dynamically resize the array if it becomes full
        while (number != 0) {
            // Check if current array is full
            if (index == maxDigit) {
                maxDigit += 10; // Increase capacity by 10
                int[] temp = new int[maxDigit]; // Create a larger temporary array

                // Copy all elements from the old array to the new temporary array
                for (int i = 0; i < digits.length; i++)
                    temp[i] = digits[i];

                // Point the original array reference to the new, larger array
                digits = temp;
            }

            // Extract the last digit and move to the next
            digits[index++] = number % 10;
            number /= 10;
        }

        // Initialize variables for the top two digits
        int largest = 0, secondLargest = 0;

        // Iterate through the collected digits to find the two highest values
        for (int i = 0; i < index; i++) {
            // If current digit is strictly greater than current largest
            if (digits[i] > largest) {
                secondLargest = largest; // Demote old largest to second largest
                largest = digits[i]; // Update largest with new value
            }
            // If digit is smaller than largest but larger than current second largest
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the results
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        // Close the scanner resource
        input.close();
    }
}
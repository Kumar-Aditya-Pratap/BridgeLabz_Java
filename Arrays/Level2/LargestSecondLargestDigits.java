package Arrays.Level2;

import java.util.Scanner;

/**
 * The LargestSecondLargestDigits class extracts individual digits from an integer,
 * stores them in an array, and then iterates through that array to identify 
 * the largest and the second-largest unique digits present in the number.
 */
class LargestSecondLargestDigits {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read the integer to be processed
        int number = input.nextInt();
        
        // Define an array to store up to 10 digits and a counter for the actual count
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits using modulo and division, storing them in the array
        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10; // Get the last digit
            number /= 10;                  // Remove the last digit
        }

        // Initialize variables to track the two highest values found
        int largest = -1, secondLargest = -1;

        // Loop through the extracted digits to find the top two unique values
        for (int i = 0; i < index; i++) {
            // Case 1: Current digit is greater than the current largest
            if (digits[i] > largest) {
                secondLargest = largest; // Old largest becomes second largest
                largest = digits[i];     // Update largest with the new value
            } 
            // Case 2: Current digit is between largest and second largest
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results to the console
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        // Close the scanner resource
        input.close();
    }
}
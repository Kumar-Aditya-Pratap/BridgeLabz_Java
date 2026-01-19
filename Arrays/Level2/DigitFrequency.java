package Arrays.Level2;

import java.util.Scanner;

/**
 * The DigitFrequency class calculates how many times each digit (0-9)
 * appears in a given integer. It uses a frequency array where the
 * index represents the digit and the value at that index represents
 * the count of occurrences.
 */
class DigitFrequency {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read the integer from which digits will be counted
        int number = input.nextInt();

        // Create an array of size 10 to store counts for digits 0 through 9
        int[] freq = new int[10];

        // Process the number digit by digit until it becomes 0
        while (number != 0) {
            // Extract the last digit using modulo 10 and increment its count in the array
            freq[number % 10]++;

            // Remove the last digit from the number using integer division
            number /= 10;
        }

        // Iterate through the frequency array to display the results
        for (int i = 0; i < freq.length; i++) {
            // Print the digit (index) and its corresponding count (value)
            System.out.println(i + " -> " + freq[i]);
        }

        // Close the scanner resource
        input.close();
    }
}
package Arrays.Level2;

import java.util.Scanner;

/**
 * The ReverseNumberArray class takes an integer as input and reverses its
 * digits.
 * It first counts the number of digits to initialize an array of the exact
 * size,
 * stores each digit in the array by extracting them from right to left,
 * and finally prints the array elements to show the reversed number.
 */
class ReverseNumberArray {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read the initial number and create a copy to calculate digit count
        int number = input.nextInt();
        int temp = number, count = 0;

        // Step 1: Count total digits to determine the required array size
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Initialize an array with the exact size needed to store the digits
        int[] digits = new int[count];

        // Step 2: Extract digits from the end of the number and store in the array
        // Because we extract the last digit first, the array naturally stores them in
        // reverse order
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10; // Get the rightmost digit
            number /= 10; // Remove the rightmost digit
        }

        // Step 3: Print each digit from the array to display the reversed number
        for (int i = 0; i < count; i++)
            System.out.print(digits[i]);

        // Close scanner to free resources
        input.close();
    }
}
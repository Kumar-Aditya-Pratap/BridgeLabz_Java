package Arrays.Level2;

import java.util.Scanner;

/**
 * The YoungestAndTallestArray class collects age and height data for three
 * individuals.
 * It utilizes parallel arrays to store the input and then iterates through them
 * to determine the minimum value for age (youngest) and the maximum value
 * for height (tallest).
 */
class YoungestAndTallestArray {
    public static void main(String[] args) {
        // Initialize Scanner for reading user input
        Scanner input = new Scanner(System.in);

        // Arrays to store data for exactly 3 people
        int[] age = new int[3];
        double[] height = new double[3];

        // Loop to populate the arrays with user-provided age and height
        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }

        // Initialize tracking variables with the first element of each array
        int youngest = age[0];
        double tallest = height[0];

        // Compare remaining elements to find the youngest and the tallest
        for (int i = 1; i < 3; i++) {
            // Update youngest if a lower age is found
            if (age[i] < youngest)
                youngest = age[i];

            // Update tallest if a greater height is found
            if (height[i] > tallest)
                tallest = height[i];
        }

        // Output the final results to the console
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Tallest Height: " + tallest);

        // Close the scanner resource
        input.close();
    }
}
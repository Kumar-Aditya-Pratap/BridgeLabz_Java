package Arrays.Level2;

import java.util.Scanner;

/**
 * The BMI2DArray class is designed to process physical data for multiple
 * individuals.
 * It takes weight (kg) and height (cm) as input, calculates the Body Mass Index
 * (BMI)
 * using a 2D array, determines the weight category (Underweight, Normal,
 * Overweight, Obese),
 * and displays the comprehensive results for each person.
 */
class BMI2DArray {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read the number of individuals to process
        int n = input.nextInt();

        // Create a 2D array to store [weight, height, calculated_bmi] for 'n' people
        double[][] data = new double[n][3];
        // Create a String array to store the health status for each person
        String[] status = new String[n];

        // Loop through each person to collect data and perform calculations
        for (int i = 0; i < n; i++) {
            // Take weight and height input from the user
            data[i][0] = input.nextDouble(); // weight in kg
            data[i][1] = input.nextDouble(); // height in cm

            // Validate that inputs are positive numbers
            if (data[i][0] <= 0 || data[i][1] <= 0) {
                System.out.println("Invalid input");
                i--; // Decrement index to re-enter data for this person
                continue;
            }

            // Calculate BMI using the formula: weight(kg) / [height(m)]^2
            data[i][2] = data[i][0] / Math.pow(data[i][1] / 100, 2);

            // Assign a status category based on the calculated BMI value
            if (data[i][2] < 18.5)
                status[i] = "Underweight";
            else if (data[i][2] < 25)
                status[i] = "Normal";
            else if (data[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Loop through the results and print Height, Weight, BMI, and Status for each
        // person
        for (int i = 0; i < n; i++) {
            System.out.println(data[i][1] + " " + data[i][0] + " " + data[i][2] + " " + status[i]);
        }

        // Close the scanner to prevent memory leaks
        input.close();
    }
}
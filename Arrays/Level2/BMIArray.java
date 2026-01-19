package Arrays.Level2;

import java.util.Scanner;

/**
 * The BMIArray class calculates the Body Mass Index (BMI) for a set of
 * individuals.
 * It uses multiple parallel arrays to store weight, height, BMI values, and
 * weight categories. The program validates input, performs the calculation
 * using the metric formula, and outputs the final data for each person.
 */
class BMIArray {
    public static void main(String[] args) {
        // Initialize the scanner for capturing user input
        Scanner input = new Scanner(System.in);

        // Read the total number of individuals to be processed
        int n = input.nextInt();

        // Define parallel arrays to store related data at the same index 'i'
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Loop to collect data and perform calculations for each person
        for (int i = 0; i < n; i++) {
            // Read weight (kg) and height (cm)
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            // Validate that height and weight are positive values
            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input");
                i--; // Decrement index to allow the user to retry this entry
                continue;
            }

            // Calculate BMI: weight / (height in meters squared)
            bmi[i] = weight[i] / Math.pow(height[i] / 100, 2);

            // Determine health status based on standard BMI ranges
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Iterate through the arrays to print the final summary for each individual
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }

        // Close the scanner resource
        input.close();
    }
}
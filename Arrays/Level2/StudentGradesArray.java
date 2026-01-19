package Arrays.Level2;

import java.util.Scanner;

/**
 * The StudentGradesArray class processes Physics, Chemistry, and Maths marks
 * for a specific number of students. It calculates the average percentage
 * for each student, assigns a letter grade (A-D) based on performance,
 * and stores the results in parallel arrays for output.
 */
class StudentGradesArray {
    public static void main(String[] args) {
        // Initialize Scanner for reading marks from the console
        Scanner input = new Scanner(System.in);

        // Read the total number of students to be processed
        int n = input.nextInt();

        // Define parallel arrays to store the final percentage and grade for each
        // student
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Loop to capture marks and calculate academic results
        for (int i = 0; i < n; i++) {
            // Read marks for Physics (p), Chemistry (c), and Maths (m)
            double p = input.nextDouble();
            double c = input.nextDouble();
            double m = input.nextDouble();

            // Validate that all entered marks are non-negative
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks");
                i--; // Decrement index to allow the user to re-enter data for this student
                continue;
            }

            // Calculate the mean percentage across the three subjects
            percentage[i] = (p + c + m) / 3;

            // Decision logic to assign grades based on percentage thresholds
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        // Output the results by iterating through the stored data
        for (int i = 0; i < n; i++) {
            System.out.println(percentage[i] + " " + grade[i]);
        }

        // Close the scanner to release system resources
        input.close();
    }
}
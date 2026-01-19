package Arrays.Level2;

import java.util.Scanner;

/**
 * The StudentGrades2DArray class manages academic performance data for 'n'
 * students.
 * It uses a 2D array to store marks for three subjects per student and parallel
 * arrays to track their calculated percentages and final letter grades.
 * The program includes input validation and categorizes students based on
 * their average score.
 */
class StudentGrades2DArray {
    public static void main(String[] args) {
        // Initialize Scanner for reading marks
        Scanner input = new Scanner(System.in);

        // Read the number of students
        int n = input.nextInt();

        // 2D Array: n rows (students) and 3 columns (Subject 1, Subject 2, Subject 3)
        double[][] marks = new double[n][3];
        // Parallel arrays to store calculated results for each student
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Loop through each student to record marks and calculate grades
        for (int i = 0; i < n; i++) {
            // Read marks for three subjects
            marks[i][0] = input.nextDouble();
            marks[i][1] = input.nextDouble();
            marks[i][2] = input.nextDouble();

            // Validate that no subject has negative marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks");
                i--; // Reset index to retry input for this specific student
                continue;
            }

            // Calculate the average percentage across the three subjects
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Assign a letter grade based on the calculated percentage
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        // Display the percentage and final grade for each student
        for (int i = 0; i < n; i++) {
            System.out.println(percentage[i] + " " + grade[i]);
        }

        // Close the input stream
        input.close();
    }
}
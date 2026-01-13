package Arrays.Level2;

import java.util.Scanner;

class StudentGradesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            double p = input.nextDouble();
            double c = input.nextDouble();
            double m = input.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks");
                i--;
                continue;
            }

            percentage[i] = (p + c + m) / 3;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percentage[i] + " " + grade[i]);
        }

        input.close();
    }
}

package Arrays.Level2;

import java.util.Scanner;

class BMI2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            data[i][0] = input.nextDouble(); // weight
            data[i][1] = input.nextDouble(); // height

            if (data[i][0] <= 0 || data[i][1] <= 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }

            data[i][2] = data[i][0] / Math.pow(data[i][1] / 100, 2);

            if (data[i][2] < 18.5)
                status[i] = "Underweight";
            else if (data[i][2] < 25)
                status[i] = "Normal";
            else if (data[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(data[i][1] + " " + data[i][0] + " " + data[i][2] + " " + status[i]);
        }

        input.close();
    }
}

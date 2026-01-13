package Methods.Level2;

import java.util.Scanner;

class BMITracker {

    public static double calculateBMI(double w, double hCm) {
        double h = hCm / 100;
        return w / (h * h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            System.out.println("BMI: " + data[i][2]);
        }
        sc.close();
    }
}

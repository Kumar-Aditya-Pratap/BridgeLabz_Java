package Arrays.Level2;

import java.util.Scanner;

class YoungestAndTallestArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }

        int youngest = age[0];
        double tallest = height[0];

        for (int i = 1; i < 3; i++) {
            if (age[i] < youngest)
                youngest = age[i];
            if (height[i] > tallest)
                tallest = height[i];
        }

        System.out.println("Youngest Age: " + youngest);
        System.out.println("Tallest Height: " + tallest);

        input.close();
    }
}

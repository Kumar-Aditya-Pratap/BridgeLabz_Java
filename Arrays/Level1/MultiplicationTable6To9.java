package Arrays.Level1;

import java.util.Scanner;

class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] results = new int[4];

        for (int i = 6, j = 0; i <= 9; i++, j++) {
            results[j] = number * i;
        }

        for (int i = 6, j = 0; i <= 9; i++, j++) {
            System.out.println(number + " * " + i + " = " + results[j]);
        }

        input.close();
    }
}

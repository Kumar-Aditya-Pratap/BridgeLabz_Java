package Arrays.Level2;

import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] freq = new int[10];

        while (number != 0) {
            freq[number % 10]++;
            number /= 10;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.println(i + " -> " + freq[i]);
        }

        input.close();
    }
}

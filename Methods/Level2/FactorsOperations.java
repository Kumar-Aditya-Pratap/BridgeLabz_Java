package Methods.Level2;

import java.util.Scanner;

class FactorsOperations {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                factors[index++] = i;

        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr)
            s += v;
        return s;
    }

    public static long product(int[] arr) {
        long p = 1;
        for (int v : arr)
            p *= v;
        return p;
    }

    public static int sumOfSquares(int[] arr) {
        int s = 0;
        for (int v : arr)
            s += Math.pow(v, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));

        sc.close();
    }
}

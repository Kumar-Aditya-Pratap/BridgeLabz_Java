package Methods.Level1;

import java.util.Scanner;

class NaturalNumberSumMethod {

    public static int sumNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println("Sum = " + sumNatural(n));

        input.close();
    }
}

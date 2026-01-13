package Methods.Level1;

import java.util.Scanner;

class ChocolatesDistribution {

    public static int[] distribute(int chocolates, int children) {
        return new int[] { chocolates / children, chocolates % children };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chocolates = input.nextInt();
        int children = input.nextInt();

        int[] result = distribute(chocolates, children);
        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

        input.close();
    }
}

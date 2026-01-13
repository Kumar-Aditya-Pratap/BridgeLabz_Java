package Methods.Level1;
import java.util.Scanner;

class Handshakes {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int students = input.nextInt();
        int handshakes = calculateHandshakes(students);

        System.out.println("Maximum Handshakes: " + handshakes);
        input.close();
    }
}

/*
 * This class compares recursive and iterative
 * Fibonacci implementations.
 */
public class fibonacciComparison {

    // Recursive Fibonacci (inefficient)
    static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (efficient)
    static int fibonacciIterative(int n) {
        int a = 0, b = 1;

        // Loop to compute Fibonacci
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Iterative Fibonacci: " + fibonacciIterative(10));
    }
}

/*
 * This class solves the Stock Span Problem using Stack.
 * It calculates the number of consecutive days
 * the stock price was less than or equal to current price.
 */

import java.util.Stack;

class stockSpanProblem {

    static void calculateSpan(int[] price) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[price.length];

        stack.push(0);
        span[0] = 1;

        // Traverse stock prices
        for (int i = 1; i < price.length; i++) {

            // Pop while price is higher
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        // Print span values
        for (int s : span) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        calculateSpan(price);
    }
}

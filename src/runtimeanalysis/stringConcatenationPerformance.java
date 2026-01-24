/*
 * This class demonstrates performance differences
 * between String, StringBuilder, and StringBuffer.
 */
public class stringConcatenationPerformance {

    public static void main(String[] args) {

        // Using String (inefficient)
        String str = "";
        for (int i = 0; i < 1000; i++) {
            str += i; // Creates new object every time
        }

        // Using StringBuilder (efficient)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }

        // Using StringBuffer (thread-safe)
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            buffer.append(i);
        }

        System.out.println("String concatenation completed");
    }
}

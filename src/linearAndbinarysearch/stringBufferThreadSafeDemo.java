/*
 * This class demonstrates that StringBuffer
 * is thread-safe in nature.
 */

public class stringBufferThreadSafeDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Safe");

        // Append operation
        sb.append(" Thread");

        System.out.println(sb);
    }
}

/*
 * This class demonstrates insert and delete
 * operations using StringBuilder.
 */

public class stringBuilderInsertDelete {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Jvaa");

        // Insert missing character
        sb.insert(2, "a");

        // Delete extra character
        sb.deleteCharAt(3);

        System.out.println(sb);
    }
}

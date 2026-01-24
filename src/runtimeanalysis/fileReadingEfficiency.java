
/*
 * This class explains efficiency differences
 * between FileReader and InputStreamReader.
 */
import java.io.*;

public class fileReadingEfficiency {

    public static void main(String[] args) throws Exception {

        // Reading file using FileReader
        FileReader fr = new FileReader("sample.txt");
        while (fr.read() != -1) {
            // Reading character by character
        }
        fr.close();

        // Reading file using InputStreamReader
        InputStreamReader isr = new InputStreamReader(new FileInputStream("sample.txt"));
        while (isr.read() != -1) {
            // Reading byte stream converted to characters
        }
        isr.close();

        System.out.println("File reading completed");
    }
}

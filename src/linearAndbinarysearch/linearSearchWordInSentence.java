/*
 * This class checks whether a given word
 * exists in a sentence using Linear Search.
 */

public class linearSearchWordInSentence {

    public static void main(String[] args) {

        String sentence = "Java is easy to learn";
        String word = "easy";

        String[] words = sentence.split(" ");

        // Loop through each word
        for (String w : words) {

            // Compare word
            if (w.equals(word)) {
                System.out.println("Word found");
                return;
            }
        }

        System.out.println("Word not found");
    }
}

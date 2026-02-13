package OOPDesignPrinciples.ObjectModelling.Level1.LibraryAggregation;

public class Book {

    /*
     This class represents a Book in the library system.
     A book has its own identity defined by title and author.
     It can exist independently without being part of any library,
     which makes it suitable for demonstrating aggregation.
    */

    // Stores book title
    private String title;

    // Stores book author
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Displays book details
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

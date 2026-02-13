package KeyAndInstances;
public class LibraryManagementSystem {

    /*
     This program models a library management system using static, this,
     final, and instanceof keywords. It demonstrates shared library data,
     immutable ISBN values, and safe object verification before displaying
     book details.
    */

    // Static variable shared across library books
    static String libraryName = "City Library";

    // Final variable ensures ISBN cannot be modified
    final String isbn;

    // Instance variables for book details
    String title;
    String author;

    // Constructor initializes book information
    public LibraryManagementSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method safely displays book details
    void displayBookDetails(Object obj) {
        // Check object type before accessing data
        if (obj instanceof LibraryManagementSystem) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        // Create a book object
        LibraryManagementSystem book =
                new LibraryManagementSystem("Effective Java", "Joshua Bloch", "ISBN123");

        // Display shared library name
        displayLibraryName();

        // Display book details
        book.displayBookDetails(book);
    }
}

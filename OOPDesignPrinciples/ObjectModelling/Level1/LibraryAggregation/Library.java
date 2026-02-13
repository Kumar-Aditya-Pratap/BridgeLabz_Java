package OOPDesignPrinciples.ObjectModelling.Level1.LibraryAggregation;
import java.util.ArrayList;

public class Library {

    /*
     This class represents a Library that aggregates multiple Book objects.
     The library does not own the lifecycle of books, meaning books can
     exist even if the library is removed. This models aggregation clearly.
    */

    // Stores list of books in the library
    private ArrayList<Book> books = new ArrayList<>();

    // Adds a book to the library collection
    public void addBook(Book book) {
        books.add(book);
    }

    // Displays all books in the library
    public void showBooks() {
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    public static void main(String[] args) {
        // Creating independent book objects
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Clean Code", "Robert Martin");

        // Creating library and aggregating books
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Displaying library contents
        library.showBooks();
    }
}

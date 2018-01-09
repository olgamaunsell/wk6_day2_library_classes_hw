import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;


    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    //    Method to count the number of books in the library.
    public int bookCount() {
        return this.books.size();
    }

    //    Method to check capacity of library before adding a book.
    public void addBook(Book book) {
        if(bookCount() < this.capacity) {
            this.books.add(book);
        }
    }
    // Method to remove a book from the library
    public void removeBook(Book book) {
        this.books.remove(book);
    }
}

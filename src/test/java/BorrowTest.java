import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower("Olga");
        book = new Book();
        library = new Library(10);
        library.addBook(book);
    }

    @Test

    public void collectionStartsEmpty(){

        assertEquals(0, borrower.bookCount());
    }

    @Test

    public void canBorrowBook(){
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
    }
}

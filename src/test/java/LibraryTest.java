import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(10);
        book = new Book();

    }

    @Test

    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test

    public void canAddBook(){
        int bookCountBefore = library.bookCount();
        library.addBook(book);
        assertEquals(bookCountBefore+1, library.bookCount());

    }

    @Test
    public void canAddBookIfStockLessThanCapacity(){
        int bookCountBefore = library.bookCount();
        library.addBook(book);
        assertEquals(bookCountBefore+1, library.bookCount());
    }

}

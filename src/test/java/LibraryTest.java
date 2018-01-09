import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Library library2;
    Book book;
    Book book2;

    @Before
    public void before() {
        library = new Library(10);
        library2 = new Library(1);
        book = new Book();
        book2 = new Book();

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

    @Test
    public void cantAddBookIfLibraryFull(){
        int bookCountBefore = library2.bookCount();
        library2.addBook(book);
        library2.addBook(book2);
        assertEquals(bookCountBefore+1, library2.bookCount());
    }
}

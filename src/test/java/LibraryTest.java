import org.junit.Before;
import org.junit.Test;

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

//    Another way to test capacity

    @Test
    public void cantAddMoreThanCapacity(){
        for (int i = 0; i<12; i++){
            library.addBook(book);
        }
        assertEquals(10, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        int bookCountBefore = library.bookCount();
        library.removeBook();
        assertEquals(bookCountBefore-1, library.bookCount());


    }
}


//MVP
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.
//        Extensions:
//        Add a third class which interacts with the other two.
//        E.g. you could add a Borrower with a method that takes a Book and moves to the Boerrrow's collection.
//        Add a String for the genre of books. (e.g. thriller, crime, etc.)
//        Advanced Extension
//        Create a function to go through the books in the library stock and create a HashMap with the key being the genre property and value being a count of how many of that Genre.
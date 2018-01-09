import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;


    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int bookCount() {
        return this.books.size();
    }
}

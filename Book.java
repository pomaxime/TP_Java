import java.util.ArrayList;

public abstract class Book {
    private String title;
    private String author;
    private int id;
    private static List<Book> library = new ArrayList<>();

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        library.add(this);
    }
}
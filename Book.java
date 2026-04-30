import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int id;
    private static List<Book> library = new ArrayList<>();

    public Book() {
            this.title = "book";
            this.author = "author";
            this.id = 0;
            library.add(this);
    }

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        library.add(this);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getId() {
        return this.id;
    }

    public static String ShowBook() {
        StringBuilder res = new StringBuilder();
        for (Book b : library) {
            res.append(b).append("\n");
        }
        return res.toString();
    }

    @Override
    public String toString() {
        return this.title + ", " + this.author + ", " + this.id;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int id;
    private boolean borrowed;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.borrowed = false;
        // library.add(this);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    // public static List<Book> getLibrary() {
    //     return library;
    // }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
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

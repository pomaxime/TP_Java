
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

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "ID: " + id +
            " | Titre: " + title +
            " | Auteur: " + author +
            " | Emprunté: " + (borrowed ? "Oui" : "Non");
    }
}
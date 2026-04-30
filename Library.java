import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<String[]> users;
    private int nextBookId;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        nextBookId = 1;
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author, nextBookId++));
    }

    public void borrowBook(int id) {
        try {
        boolean found = false;
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getId() == id) {
                    found = true;
                    if (books.get(i).isBorrowed()) {
                        System.out.println("Ce livre est déjà emprunté.");
                    } else {
                        books.get(i).setBorrowed(true);
                        System.out.println("Livre emprunté avec succès !");
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Aucun livre trouvé avec cet ID.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
 
    public void returnBook(int id) {
        try {
        boolean found = false;
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getId() == id) {
                    found = true;
                    if (!books.get(i).isBorrowed()) {
                        System.out.println("Ce livre n'est pas emprunté.");
                    } else {
                        books.get(i).setBorrowed(false);
                        System.out.println("Livre retourné avec succès !");
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Aucun livre trouvé avec cet ID.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Aucun livre à afficher. La bibliothèque est vide.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void displayAvailableBooks() {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (!books.get(i).isBorrowed()) {
                System.out.println(books.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun livre disponible.");
        }
    }

    public void addUser(String id, String nom) {
        users.add(new String[]{id, nom});
        System.out.println("Utilisateur ajouté : " + nom);
    }

    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("Aucun utilisateur enregistré.");
            return;
        }
        for (int i = 0; i < users.size(); i++) {
            System.out.println("ID: " + users.get(i)[0] + " | Nom: " + users.get(i)[1]);
        }
    }

    public void searchBook(String keyword) {
        System.out.println("=== Résultats de la recherche ===");
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun livre trouvé.");
        }
    }

}

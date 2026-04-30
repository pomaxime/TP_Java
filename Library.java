public class Library {
    private Book book;

    private static ArrayList<Book> library = new ArrayList<>();

    public showBook() {
        return Library;
    }

    public Library() {
        books = new ArrayList<>();
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
}

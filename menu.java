import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bibliotheque library = new Library();

        System.out.println("Données de démonstration chargées.");

        int choix = -1;

        while (choix != 0) {

            System.out.println();
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║         📚  BIBLIOTHÈQUE  📚         ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println("║  LIVRES                               ║");
            System.out.println("║  1. Ajouter un livre                  ║");
            System.out.println("║  2. Afficher tous les livres          ║");
            System.out.println("║  3. Emprunter un livre                ║");
            System.out.println("║  4. Retourner un livre                ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println("║  UTILISATEURS                         ║");
            System.out.println("║  5. Ajouter un utilisateur            ║");
            System.out.println("║  6. Afficher les utilisateurs         ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println("║  BONUS                                ║");
            System.out.println("║  7. Rechercher un livre               ║");
            System.out.println("║  8. Livres disponibles                ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println("║  0. Quitter                           ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.print("Votre choix : ");

            try {
                choix = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre.");
                continue;
            }

            if (choix == 1) {
                System.out.print("ID du livre : ");
                String id = scanner.nextLine();
                System.out.print("Titre : ");
                String titre = scanner.nextLine();
                System.out.print("Auteur : ");
                String auteur = scanner.nextLine();
                try {
                    Book book = new Book(titre, auteur, id);
                    library.addBook(book);
                } catch (IllegalArgumentException e) {
                    System.out.println("Erreur : " + e.getMessage());
                }

            } else if (choix == 2) {
                library.displayBooks();

            } else if (choix == 3) {
                System.out.print("ID du livre : ");
                String livreId = scanner.nextLine();
                System.out.print("ID utilisateur : ");
                String userId = scanner.nextLine();
                try {
                    library.emprunterLivre(livreId, userId);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    System.out.println("Erreur : " + e.getMessage());
                }

            } else if (choix == 4) {
                System.out.print("ID du livre : ");
                String livreId = scanner.nextLine();
                System.out.print("ID utilisateur : ");
                String userId = scanner.nextLine();
                try {
                    library.retournerLivre(livreId, userId);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    System.out.println("Erreur : " + e.getMessage());
                }

            } else if (choix == 5) {
                System.out.print("ID utilisateur : ");
                String id = scanner.nextLine();
                System.out.print("Nom : ");
                String nom = scanner.nextLine();
                try {
                    library.addUser(id, nom);
                } catch (IllegalArgumentException e) {
                    System.out.println("Erreur : " + e.getMessage());
                }

            } else if (choix == 6) {
                library.displayUsers();

            } else if (choix == 7) {
                System.out.print("Titre ou auteur : ");
                String motCle = scanner.nextLine();
                library.searchBooks(motCle);

            } else if (choix == 8) {
                library.displayAvailableBooks();

            } else if (choix == 0) {
                System.out.println("Au revoir !");

            } else {
                System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}
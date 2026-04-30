import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice = 0;
        System.out.println("=== Bienvenue dans la bibliothèque ===");
        while (choice != 0) {

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
                
                choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                
                    case 1:
                        System.out.print("Titre : ");
                        String title = scanner.nextLine();
                        System.out.print("Auteur : ");
                        String author = scanner.nextLine();
                        library.addBook(new Book(title, author, library.nextBookId++));
                        break;
                
                    case 2:
                        library.displayBooks();
                        break;
                    
                    case 3:
                        System.out.print("ID du livre à emprunter : ");
                        int borrowId = scanner.nextInt();
                        scanner.nextLine();
                        library.borrowBook(borrowId);
                        break;
                
                    case 4:
                        System.out.print("ID du livre à retourner : ");
                        int returnId = scanner.nextInt();
                        scanner.nextLine();
                        library.returnBook(returnId);
                        break;
                
                    case 5:
                        System.out.print("ID utilisateur : ");
                        String userId = scanner.nextLine();
                        System.out.print("Nom : ");
                        String userName = scanner.nextLine();
                        library.addUser(userId, userName);
                        break;
                
                    case 6:
                        library.displayUsers(); 
                        break;
                    
                    case 7:
                        System.out.print("Mot-clé : ");
                        String searchKeyword = scanner.nextLine();
                        library.searchBook(searchKeyword);
                        break;
                    
                    case 8:
                        library.displayAvailableBooks();
                        break;
                    
                    case 0:
                        System.out.println("Merci d'avoir utilisé la bibliothèque. Au revoir !");
                        break;
                
                    default:
                        System.out.println("Choix invalide, réessayez.");
                        break;
                }
            
            } catch (Exception e) {
                System.out.println("Entrée invalide, veuillez entrer un nombre.");
                scanner.nextLine();
            }
        
        }
        scanner.close();
    
    }

}
public class TestRunner {
    public class TestRunner {
    public static void main(String[] args) {
        Library library = new Library();

        Book ET = new Book("E.T", "Spielbergs", 1);
        Book ZBOOB = new Book("ZBOOB", "ZGEG", 2);

        library.addBook(ET);
        library.addBook(ZBOOB);

        library.displayBooks("");
    }

Book ET = new Book("E.T", "Spielbergs", 1);
        
        Book ZBOOB = new Book("ZBOOB", "ZGEG", 2);
        Book dune = new Book("Dune", "Frank Herbert", 3);
        Book fondation = new Book("Fondation", "Isaac Asimov", 4);
        Book lotr = new Book("Le Seigneur des Anneaux", "J.R.R. Tolkien", 5);
        Book h2g2 = new Book("Le Guide du Voyageur Galactique", "Douglas Adams", 6);
        Book fahrenheit = new Book("Fahrenheit 451", "Ray Bradbury", 7);
                
        library.displayBooks("");
    }
}
import java.util.Set;
import java.util.TreeSet;

class LibraryCatalog {
    //Set does not allow duplicates and tree set ensures the books are stored in alphabetical order
    private Set<String> books = new TreeSet<>();

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            System.out.println("Added: " + title);
        } else {
            System.out.println("Duplicate not allowed: " + title);
        }
    }

    public void displaySortedBooks() {
        System.out.println("\nBooks in Alphabetical Order:");
        for (String title : books) {
            System.out.println(title);
        }
    }

    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook("Java Programming");
        catalog.addBook("Data Structures");
        catalog.addBook("Algorithms");
        catalog.addBook("Python Basics");
        catalog.addBook("Web Development");

        catalog.displaySortedBooks();
    }
}


import model.Book;
import model.Person;
import model.Student;
import model.Librarian;
import operations.LibraryManager;

public class Main {
    public static void main(String[] args) {
        // Create Library Manager
        LibraryManager manager = new LibraryManager();

        // Create books
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Python Basics", "Guido van Rossum");
        Book b3 = new Book("Effective Java", "Joshua Bloch");

        // Add books to library
        manager.addBook(b1);
        manager.addBook(b2);
        manager.addBook(b3);

        // Create users
        Student student1 = new Student("Amit");
        Librarian librarian1 = new Librarian("Mr. Sharma");

        // View books
        System.out.println();
        student1.viewBooks();
        manager.showAllBooks();

        // Issue a book
        System.out.println();
        manager.issueBook(b1, student1);

        // Try to issue it again
        manager.issueBook(b1, student1);

        // Return the book
        System.out.println();
        manager.returnBook(b1, student1);

        // Librarian action
        System.out.println();
        librarian1.manageLibrary();

        // Final view
        System.out.println();
        manager.showAllBooks();
    }
}

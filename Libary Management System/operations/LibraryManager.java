package operations;

import model.Book;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements LibraryOperations {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println(book.getTitle() + " removed from library.");
    }

    @Override
    public void issueBook(Book book, Person user) {
        if (!book.isIssued()) {
            book.issue();
                System.out.println(user.getName() + " issued " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already issued.");
        }
    }

    @Override
    public void returnBook(Book book, Person user) {
        if (book.isIssued()) {
            book.returnBook();
            System.out.println(user.getName() + " returned " + book.getTitle());

        } else {
            System.out.println(book.getTitle() + " was not issued.");
        }
    }

    @Override
    public void showAllBooks() {
        System.out.println("\nAvailable Books in Library:");
        for (Book b : books) {
            System.out.println("- " + b.getTitle() + " by " + b.getAuthor() + (b.isIssued() ? " [Issued]" : ""));
        }
    }
}

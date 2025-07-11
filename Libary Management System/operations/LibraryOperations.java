package operations;

import model.Book;
import model.Person;

public interface LibraryOperations {
    void addBook(Book book);
    void removeBook(Book book);
    void issueBook(Book book, Person user);
    void returnBook(Book book, Person user);
    void showAllBooks();
}

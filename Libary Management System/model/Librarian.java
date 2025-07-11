package model;

public class Librarian extends Person {
    public Librarian(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Librarian";
    }

    public void manageLibrary() {
        System.out.println(name + " is managing the library.");
    }
}

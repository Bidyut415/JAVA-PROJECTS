package model;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void viewBooks() {
        System.out.println(name + " is viewing books...");
    }

    public String getRole() {
        return "Person";
    }
    public String getName() {
        return name;
    }
}

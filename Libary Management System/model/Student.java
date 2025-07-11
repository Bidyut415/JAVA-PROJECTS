package model;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Student";
    }
}

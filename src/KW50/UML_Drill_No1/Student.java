package KW50.UML_Drill_No1;

public class Student extends Person {
    private String id;

    public Student(String name, String id) {
        super(name);
        this.id = id;
    }

    public String toString() {
        return id;
    }
}

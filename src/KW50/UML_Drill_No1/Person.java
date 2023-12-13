package KW50.UML_Drill_No1;

import java.util.List;

public class Person {
    private String name;
    private List<Answer> answers;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

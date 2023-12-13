package KW50.UML_Drill_No1;

import java.util.List;

public class Question {
    private String text;
    private double weight;
    protected List<Answer> answers;

    public Question(String s, double d) {
        text = s;
        weight = d;
    }

    public String ask() {
        return text;
    }

    public List<Answer> answers() {
        return answers;
    }
}

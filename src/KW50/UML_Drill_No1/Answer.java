package KW50.UML_Drill_No1;

public class Answer {
    private String text;
    protected Person of;
    private Question q;

    public Answer(String text, Person person) {
        this.text = text;
        of = person;
    }

    public void change(String s) {
        text = s;
    }

    public String answer() {
        return text;
    }

    public boolean check() {
        return true;
    }
}

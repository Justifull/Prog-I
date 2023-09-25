package KW49.UML_Drill_No1;

import java.util.List;

public class Exam {
    private String title;
    private String date;
    private int duration;
    private List<Question> qs;

    public Exam(String title, String date, int duration) {
        this.title= title;
        this.date = date;
        this.duration = duration;
    }

    public void changeDate(String newDate) {
        date = newDate;
    }

    public List<Answer> getResults() {
        return null;
    }

    public void addQuestion(Question q) {
        qs.add(q);
    }
}

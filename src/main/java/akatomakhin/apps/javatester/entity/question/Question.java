package akatomakhin.apps.javatester.entity.question;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private List<String> Answers = new ArrayList<String>();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return Answers;
    }

    public void setAnswers(List<String> answers) {
        Answers = answers;
    }
}

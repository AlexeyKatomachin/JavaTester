package akatomakhin.apps.javatester.entity.answer;


import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String title;
    private List<String> answers = new ArrayList<String>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public boolean equals(List<String> answers){
        flag: for (String answerNew: answers) {
            for (String answerOld: this.answers) {
                if (answerNew == answerOld){
                    continue flag;
                }
            }
            return false;
        }
        return true;
    }
}

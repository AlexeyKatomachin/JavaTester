package akatomakhin.apps.javatester.entity.question.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question", schema = "javatester")
public class DBQuestion {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "question")
    private String question;
    @Column(name = "answer")
    private String answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

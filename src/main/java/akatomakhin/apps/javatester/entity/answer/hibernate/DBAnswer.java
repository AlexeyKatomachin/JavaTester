package akatomakhin.apps.javatester.entity.answer.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "answer", schema = "javatester")
public class DBAnswer {
    @Id
    @Column(name = "id")
    private int id;
    @Column (name = "answer")
    private List<String> answers = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}

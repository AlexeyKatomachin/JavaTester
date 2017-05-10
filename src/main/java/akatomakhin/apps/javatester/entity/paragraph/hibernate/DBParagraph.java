package akatomakhin.apps.javatester.entity.paragraph.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paragraph", schema = "javatester")
public class DBParagraph {
    @Column(name = "part")
    private int part;
    @Id
    @Column(name = "title")
    private String title;

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

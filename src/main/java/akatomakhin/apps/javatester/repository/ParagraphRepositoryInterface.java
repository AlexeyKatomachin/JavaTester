package akatomakhin.apps.javatester.repository;

import akatomakhin.apps.javatester.entity.paragraph.hibernate.DBParagraph;
import org.springframework.data.repository.CrudRepository;


public interface ParagraphRepositoryInterface extends CrudRepository<DBParagraph,String> {
}

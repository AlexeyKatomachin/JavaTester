package akatomakhin.apps.javatester.repository;

import akatomakhin.apps.javatester.entity.question.hibernate.DBQuestion;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepositoryInterface extends CrudRepository<DBQuestion,Integer> {
}

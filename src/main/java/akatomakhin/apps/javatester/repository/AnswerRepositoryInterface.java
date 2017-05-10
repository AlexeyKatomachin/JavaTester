package akatomakhin.apps.javatester.repository;

import akatomakhin.apps.javatester.entity.answer.hibernate.DBAnswer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepositoryInterface extends CrudRepository<DBAnswer,Integer> {
}

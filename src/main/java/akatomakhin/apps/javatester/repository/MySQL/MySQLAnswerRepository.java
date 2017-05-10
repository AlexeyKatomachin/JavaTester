package akatomakhin.apps.javatester.repository.MySQL;

import akatomakhin.apps.javatester.entity.answer.hibernate.DBAnswer;
import akatomakhin.apps.javatester.repository.AnswerRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MySQLAnswerRepository {
    private AnswerRepositoryInterface answerRepository;

    @Autowired
    MySQLAnswerRepository(AnswerRepositoryInterface answerRepository){
        this.answerRepository = answerRepository;
    }

    public DBAnswer getAnswers(int id){
        return answerRepository.findOne(id);
    }
}

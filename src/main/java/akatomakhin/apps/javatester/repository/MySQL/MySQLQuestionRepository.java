package akatomakhin.apps.javatester.repository.MySQL;


import akatomakhin.apps.javatester.repository.QuestionRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class MySQLQuestionRepository {
    private QuestionRepositoryInterface questionRepository;

    MySQLQuestionRepository(QuestionRepositoryInterface questionRepository){
        this.questionRepository = questionRepository;
    }

    public String getQuestion(int id){
        return questionRepository.findOne(id).getQuestion();
    }

    public String getAnswer(int id){
        return questionRepository.findOne(id).getAnswer();
    }
}

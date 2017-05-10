package akatomakhin.apps.javatester.facade;


import akatomakhin.apps.javatester.entity.answer.Answer;
import akatomakhin.apps.javatester.entity.question.Question;
import akatomakhin.apps.javatester.repository.MySQL.MySQLAnswerRepository;
import akatomakhin.apps.javatester.repository.MySQL.MySQLParagraphRepository;
import akatomakhin.apps.javatester.repository.MySQL.MySQLQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaTesterFacade {
    private MySQLAnswerRepository mySQLAnswerRepository;
    private MySQLParagraphRepository mySQLParagraphRepository;
    private MySQLQuestionRepository mySQLQuestionRepository;

    @Autowired
    JavaTesterFacade (MySQLAnswerRepository mySQLAnswerRepository, MySQLParagraphRepository mySQLParagraphRepository, MySQLQuestionRepository mySQLQuestionRepository){
        this.mySQLAnswerRepository = mySQLAnswerRepository;
        this.mySQLParagraphRepository = mySQLParagraphRepository;
        this.mySQLQuestionRepository = mySQLQuestionRepository;
    }

    public Question makeQuestion(String title){
        Question question = new Question();
        question.setAnswers(mySQLAnswerRepository.getAnswers(mySQLParagraphRepository.getID(title)).getAnswers());
        question.setQuestion(mySQLQuestionRepository.getQuestion(mySQLParagraphRepository.getID(title)));
        return question;
    }

    public boolean getAnswer(Answer answer){
        if (mySQLQuestionRepository.getAnswer(mySQLParagraphRepository.getID(answer.getTitle()))==answer.getAnswer()){
            return true;
        }else {
            return false;
        }
    }
}

package akatomakhin.apps.javatester.repository.MySQL;

import akatomakhin.apps.javatester.repository.ParagraphRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class MySQLParagraphRepository {
    private ParagraphRepositoryInterface paragraphRepository;

    MySQLParagraphRepository(ParagraphRepositoryInterface paragraphRepository){
        this.paragraphRepository = paragraphRepository;
    }

    public int getID(String title){
        return paragraphRepository.findOne(title).getPart();
    }
}

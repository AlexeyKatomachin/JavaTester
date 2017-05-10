package akatomakhin.apps.javatester.controller;

import akatomakhin.apps.javatester.entity.answer.Answer;
import akatomakhin.apps.javatester.entity.question.Question;
import akatomakhin.apps.javatester.facade.JavaTesterFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class JavaTesterController {

    private JavaTesterFacade javaTesterFacade;

    @Autowired
    JavaTesterController(JavaTesterFacade javaTesterFacade){
        this.javaTesterFacade = javaTesterFacade;
    }

    @RequestMapping(path = "/question/{title}", method = RequestMethod.GET)
    public Question getQuestion (@PathVariable("title") String title){
        return javaTesterFacade.makeQuestion(title);
    }

    @RequestMapping(path = "/answer", method = RequestMethod.GET)
    public boolean getAnswer(@RequestBody Answer answer){
        return javaTesterFacade.getAnswer(answer);
    }

}

package bootApp.controllers;

import bootApp.entities.Word;
import bootApp.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("/words")
public class WordController {

    @Autowired
    private WordService wordService;

    @RequestMapping("/{id}")
    public Word getWord(HttpServletRequest request, @PathVariable("id") Long id) {
        Word word = wordService.getWord(id);
        System.out.println("word = " + word);
        return word;
    }


}

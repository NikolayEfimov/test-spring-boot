package bootApp.service.impl;

import bootApp.entities.Word;
import bootApp.repositories.WordRepository;
import bootApp.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordRepository wordRepository;

    @Override
    public Word getWord(Long id) {
        return wordRepository.findOne(id);
    }

    @Override
    public boolean addWord(Word word) {
        Word save = wordRepository.save(word);
        return true;
    }
}

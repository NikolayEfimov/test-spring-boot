package bootApp.service;

import bootApp.entities.Word;

public interface WordService {

    Word getWord(Long id);

    boolean addWord(Word word);
}

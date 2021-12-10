package models;

import interfaces.IDictionary;

import java.util.List;

import static utils.DataLoader.loadFromFile;

/**
 * The purpose of this class is for real implementation of a dictionary for the program
 */
public class RealDictionary implements IDictionary {
    private List<String> englishWords;
    private String ENGLISH_WORDS_FILEPATH = "src/main/resources/1000_english_word.txt";

    public RealDictionary() {
        englishWords = loadFromFile(ENGLISH_WORDS_FILEPATH);
    }

    @Override
    public boolean isEnglishWord(String word) {
        return englishWords.stream().anyMatch(word::equalsIgnoreCase);
    }
}

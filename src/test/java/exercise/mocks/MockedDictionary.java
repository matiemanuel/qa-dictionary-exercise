package exercise.mocks;

import interfaces.IDictionary;

import java.util.List;

import static utils.DataLoader.loadFromFile;

public class MockedDictionary implements IDictionary {

    private List<String> englishWords;
    private String ENGLISH_WORDS_FILEPATH = "src/test/resources/english_words.txt";

    public MockedDictionary() {
        super();
        loadWordsFromFile(ENGLISH_WORDS_FILEPATH);
    }

    private void loadWordsFromFile(String filepath) {
        englishWords = loadFromFile(filepath);
    }

    public boolean isEnglishWord(final String word) {
        return englishWords.stream().anyMatch(word::equalsIgnoreCase);
    }


}

package exercise.tests;

import exercise.mocks.MockedDictionary;
import interfaces.IDictionary;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static utils.Permutator.availablePermutations;

public class MockedDictionaryTest {

    private IDictionary dictionary;

    @Before
    public void instantiateDictionary() {
        dictionary = new MockedDictionary();
    }

    @Test
    public void searchForEnglishWord() {
        assert dictionary.isEnglishWord("Working");
    }

    @Test
    public void incorrectEnglishWord() {
        assert !dictionary.isEnglishWord("Trabajo");
    }

    @Test
    public void searchAllEnglishWordsInAString() {
        String word = "Working";
        List<String> permutations = availablePermutations(word);
        permutations.forEach(permutation -> {
            if (dictionary.isEnglishWord(permutation)) {
                System.out.println("English word found: " + permutation.toUpperCase());
            }
        });
    }
}

package utils;


import java.util.ArrayList;
import java.util.List;

public class Permutator {

    public static List<String> availablePermutations(String word) {
        List<String> results = new ArrayList<String>();
        for (int i = 2; i <= word.length(); i++) {
            anagramWord(word, 0, word.length() - 1, i, results);
        }
        return results;
    }

    public static void anagramWord(String word, int fromIndex, int lastIndex, int len, List<String> results) {
        String currentWord = word.substring(0, len);
        if (fromIndex < lastIndex) {
            for (int i = fromIndex; i <= lastIndex; i++) {
                String wordSwap = swapCharsAt(word, fromIndex, i);
                anagramWord(wordSwap, fromIndex + 1, lastIndex, len, results);
            }
        } else {
            if (!results.contains(currentWord)) {
                results.add(currentWord);
            }
        }
    }

    public static String swapCharsAt(String word, int a, int b) {
        char temp;
        char[] charArray = word.toCharArray();
        temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;
        return String.valueOf(charArray);
    }
}

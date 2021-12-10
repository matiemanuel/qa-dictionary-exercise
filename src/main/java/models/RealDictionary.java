package models;

import interfaces.IDictionary;

/**
 * The purpose of this class is for real implementation of a dictionary for the program
 */
public class RealDictionary implements IDictionary {
    @Override
    public boolean isEnglishWord(String word) {
        return word.equalsIgnoreCase("Working");
    }
}

package main;

import interfaces.IDictionary;
import models.RealDictionary;

import java.util.List;

import static java.lang.String.format;
import static utils.Permutator.availablePermutations;

public class MainExercise {
    public static void main(String[] args) {
        String word = "Work";
        IDictionary dictionary = new RealDictionary();

        List<String> permutations = availablePermutations(word);
        System.out.println("------------------- Printing words found in " + word + "-------------------");
        permutations.forEach(permutation -> {
            if (dictionary.isEnglishWord(permutation)) {
                System.out.println(permutation.toUpperCase());
            }
        });
        System.out.println(format("------------------- Printing all permutations in %s, total: %d -------------------", word, permutations.size()));
        permutations.forEach(System.out::println);

    }
}

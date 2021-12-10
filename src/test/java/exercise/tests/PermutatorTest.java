package exercise.tests;

import org.junit.Test;
import utils.Permutator;

import java.util.List;

public class PermutatorTest {

    @Test
    public void amountOfPermutationFor3Chars() {
        String word = "abc";
        List<String> permutations = Permutator.availablePermutations(word);
        permutations.forEach(System.out::println);
        assert (permutations.size() == 12);
    }

    /*
    expected amount = 12
    3! / (3-2)! + 3! =
    6 + 6 = 12
     */


    @Test
    public void amountOfPermutationFor4UniqueChars() {
        String word = "abcd";
        List<String> permutations = Permutator.availablePermutations(word);
        permutations.forEach(System.out::println);
        assert (permutations.size() == 60);
    }

    /*
    expected amount = 60
    4! / (4 - 2)! + 4! / (4 - 3)! + 4!
    12 + 24 + 24 = 60
     */

    @Test
    public void amountOfPermutationFor4RepeatedChars() {
        String word = "abcc";
        List<String> permutations = Permutator.availablePermutations(word);
        assert (permutations.size() != 60);
    }

    @Test(expected = NullPointerException.class)
    public void nullPassedAsParameterThrowsException(){
        Permutator.availablePermutations(null);
        assert false;
    }

}

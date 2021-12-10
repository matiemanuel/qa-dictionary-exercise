package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Source: https://stackoverflow.com/questions/4574041/read-next-word-in-java
 */
public class DataLoader {

    private static Scanner scanner;

    public static List<String> loadFromFile(String filepath) {
        try {
            scanner = new Scanner(new File(filepath));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List<String> data = new ArrayList<>();
        while (scanner.hasNextLine()) {
            while (scanner.hasNext()) {
                data.add(scanner.next());
            }
        }
        return data;
    }

}

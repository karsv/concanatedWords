package com.task;

import com.task.util.ConcatanatedWords;
import com.task.util.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        ConcatanatedWords concatanatedWords = new ConcatanatedWords();
        List<String> words = concatanatedWords
                .findAllConcatenatedWordsInADict(fileReader
                        .readFromFileToList("src/main/resources/wordsforproblem.txt"));
        System.out.println("The longest concatenated word: " + words.get(words.size() - 1));
        System.out.println("The 2nd longest concatenated word: " + words.get(words.size() - 2));
        System.out.println("The total count of all the concatenated words in the file: "
                + words.size());
    }
}

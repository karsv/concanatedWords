package com.task;

import com.task.model.ConcWordsResult;
import com.task.util.ConcatanatedWords;
import com.task.util.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        ConcatanatedWords concatanatedWords = new ConcatanatedWords();

        ConcWordsResult result = concatanatedWords.getResultOfConcatenatedWords(fileReader
                .readFromFileToList("src/main/resources/wordsforproblem.txt"));

        System.out.println("The longest concatenated word: "
                + result.getFirstLomgestConcWord());
        System.out.println("The 2nd longest concatenated word: "
                + result.getSecondLomgestConcWord());
        System.out.println("The total count of all the concatenated words in the file: "
                + result.getQuantityOfConcatWords());
    }
}

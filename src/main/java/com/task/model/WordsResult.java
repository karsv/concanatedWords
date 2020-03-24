package com.task.model;

import java.util.List;

public class WordsResult {
    private String firstLomgestConcWord;
    private String secondLomgestConcWord;
    private List<String> allConcatWords;

    public WordsResult(List<String> allConcatWords) {
        this.allConcatWords = allConcatWords;
        firstLomgestConcWord = allConcatWords.get(allConcatWords.size() - 1);
        secondLomgestConcWord = allConcatWords.get(allConcatWords.size() - 2);
    }

    public int getQuantityOfWords() {
        return allConcatWords.size();
    }

    public String getFirstLongestWord() {
        return firstLomgestConcWord;
    }

    public String getSecondLongestWord() {
        return secondLomgestConcWord;
    }

    public List<String> getAllConcatWords() {
        return allConcatWords;
    }

    @Override
    public String toString() {
        return "The longest concatenated word is:" + firstLomgestConcWord + "\n"
                + "The 2nd longest concatenated word is: " + secondLomgestConcWord + "\n"
                + "The total count of all the concatenated words in the file is: "
                + getQuantityOfWords() + "\n";
    }
}

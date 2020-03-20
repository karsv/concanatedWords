package com.task.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatanatedWords {
    private List<String> concatenatedWords;

    public ConcatanatedWords(List<String> words) {
        concatenatedWords = findAllConcatenatedWordsInADict(words);
    }

    public int getAmountOfAllConcatenatedWords() {
        return concatenatedWords.size();
    }

    public String getLongestConcatatedWord() {
        return concatenatedWords.get(concatenatedWords.size() - 1);
    }

    public String getSecondLongestConcatatedWord() {
        return concatenatedWords.get(concatenatedWords.size() - 2);
    }

    private List<String> findAllConcatenatedWordsInADict(List<String> words) {
        List<String> result = new ArrayList<>();
        if (words == null || words.size() == 0) {
            return result;
        }

        Collections.sort(words, Comparator.comparingInt(String::length));
        Set<String> set = new HashSet<>();

        for (int i = 1; i < words.size(); i++) {
            set.add(words.get(i - 1));
            if (isConcat(words.get(i), set)) {
                result.add(words.get(i));
            }
        }
        return result;
    }

    private boolean isConcat(String word, Set<String> setOfWords) {
        for (int j = 0; j < word.length(); j++) {
            if (setOfWords.contains(word.substring(j))) {
                return true;
            }
        }
        return false;
    }
}

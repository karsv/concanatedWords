package com.task.util;

import com.task.model.ConcWordsResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatanatedWords {
    public ConcWordsResult getResultOfConcatenatedWords(List<String> words) {
        Set<String> set = new HashSet<>(words);
        List<String> list = new ArrayList<>();
        for (String word : set) {
            if (isConcat(word, set, 0, 1)) {
                list.add(word);
            }
        }
        Collections.sort(list, Comparator.comparingInt(String::length));
        ConcWordsResult result = new ConcWordsResult(list);
        return result;
    }

    private boolean isConcat(String word, Set<String> words, int start, int end) {
        if ((start == 0 && end == word.length())
                || end > word.length()) {
            return false;
        }

        String temp = word.substring(start, end);
        if (words.contains(temp)) {
            if (end == word.length()) {
                return true;
            }
            return isConcat(word, words, end, end + 1)
                    || isConcat(word, words, start, end + 1);
        }
        return isConcat(word, words, start, end + 1);
    }
}

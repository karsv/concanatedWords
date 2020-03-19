package com.task.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatanatedWords {
    public List<String> findAllConcatenatedWordsInADict(List<String> words) {
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

    private boolean isConcat(String s, Set<String> set) {
        boolean[] posCheckes = new boolean[s.length() + 1];
        posCheckes[0] = true;
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (set.contains(s.substring(j, i))) {
                    posCheckes[i] = true;
                    break;
                }
            }
        }
        return posCheckes[s.length()];
    }
}

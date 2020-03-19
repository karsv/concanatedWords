package com.task;

import com.task.util.ConcatanatedWords;
import com.task.util.FileReader;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        ConcatanatedWords concatanatedWords = new ConcatanatedWords();
//        List<String> words = concatanatedWords
//                .findAllConcatenatedWordsInADict(fileReader
//                        .readFromFileToList("src/main/resources/wordsforproblem.txt"));
        List list = new ArrayList();
        list.add("cat");
        list.add("cats");
        list.add("catsdogcats");
        list.add("dog");
        list.add("dogcatsdog");
        list.add("hippopotamuses");
        list.add("rat");
        list.add("ratcatdogcat");
        List<String> words = concatanatedWords
                .findAllConcatenatedWordsInADict(list);
        System.out.println(words.get(words.size() - 1));
        System.out.println(words.get(words.size() - 2));
        System.out.println(words.size());
    }
}

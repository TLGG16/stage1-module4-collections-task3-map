package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> answ = new HashMap<>();
        if (sentence.isEmpty()) return answ;
        String[] words = sentence.split("[.,? ]");
        for (String word: words
             ) {
            if (!answ.containsKey(word) && !word.isEmpty()) {
                int count = 0;
                for (String word2 : words
                ) {
                    if (word.equalsIgnoreCase(word2)) count++;
                }
                answ.put(word.trim().toLowerCase(),count);
            }
        }

        return answ;
    }
}

package com.tutorial.fourthproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*Given an array of strings, return a Map<String, Integer>
containing a key for every different string in the array, and the value is that string's length.

wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}

 */

public class FourthProblem {


    public Map<String, Integer> getWordsLength(String[] words) {

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            result.put(word, word.length());

        }

        return result;
    }

    public Map<String, Integer> getWordsLengthSecond(String[] words) {
        return Arrays.stream(words)
                .collect(Collectors.toMap((String w) -> w, String::length, (e1, e2) -> e1));

    }

}


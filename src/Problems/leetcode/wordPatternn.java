package Problems.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class wordPatternn {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(pChar)) {
                if (!charToWord.get(pChar).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false;
                }
                charToWord.put(pChar, word);
                usedWords.add(word);
            }
        }

        return true;
    }
}
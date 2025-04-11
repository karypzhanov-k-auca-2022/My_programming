package Problems.code_wars;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class insertMissingLetterss {
    public static String insertMissingLetters(String str) {
        StringBuffer res = new StringBuffer();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); // lowercase alphabet

        // know the unique characters in the string
        Set<Character> uniqChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqChars.add(c);
        }

        // know the missing characters in the string
        Set<Character> missingChars = new TreeSet<>();
        for (char c : alphabet) {
            if (!uniqChars.contains(c)) {
                missingChars.add(c);
            }
        }

        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()) {

            res.append(c);

            // if the character is not seen before, add the missing characters
            if (!seen.contains(c)) {
                seen.add(c);

                // add new characters to the result a = 97, b = 98, c = 99,
                for (char missingChar : missingChars) {
                    if (missingChar > c) {
                        char bigCharToAdd = Character.toUpperCase(missingChar);
                        res.append(bigCharToAdd);
                    }
                }
            }
        }

        return res.toString();
    }
}

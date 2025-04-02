package Problems.code_wars;

public class longestWordd {
    public static String longestWord(String wordString) {
        String res = "";

        String[] words = wordString.split(" ");
        for (String word : words) {
            if (word.length() >= res.length()) {
                res = word;
            }
        }

        return res;
    }
}

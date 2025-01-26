package Problems.leetcode;

public class longest_prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null)
            return "";

        if ( strs.length == 1)
            return strs[0];
        
        StringBuffer result = new StringBuffer();

        String base_word = strs[0];
        // i -> index of the character in the base word
        // j -> index of the word in the array

        // base_word = "flower"
        // strs = ["flower", "flow", "flight"]
        for (int i = 0; i < base_word.length(); i++) {
            char currentChar = base_word.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                //  flower and f 
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) { // 
                    return result.toString();
                }
            }
            result.append(currentChar);
        }
        
        return result.toString();
    }
}

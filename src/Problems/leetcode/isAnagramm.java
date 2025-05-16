package Problems.leetcode;


public class isAnagramm {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Using an array to count occurrences of each character
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

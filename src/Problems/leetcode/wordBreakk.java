package Problems.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreakk {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        wordBreakk wb = new wordBreakk();

        // test 1
        String s = "leetcode";
        List<String> dict1 = new ArrayList<>();
        dict1.add("leet");
        dict1.add("code");
        boolean result1 = wb.wordBreak(s, dict1);
        System.out.println("Result 1: " + result1); // Expected: true

        // Test case 2
        String s2 = "applepenapple";
        List<String> dict2 = new ArrayList<>();
        dict2.add("apple");
        dict2.add("pen");
        boolean result2 = wb.wordBreak(s2, dict2);
        System.out.println("Result 2: " + result2); // Expected: true

        // Test case 3
        String s3 = "catsandog";
        List<String> dict3 = new ArrayList<>();
        dict3.add("cats");
        dict3.add("dog");
        dict3.add("sand");
        dict3.add("and");
        dict3.add("cat");
        boolean result3 = wb.wordBreak(s3, dict3);
        System.out.println("Result 3: " + result3); // Expected: false
    }
}

package Problems.leetcode;

import java.util.Stack;

public class simplifyPathh {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] st = path.split("/");

        for (String s : st) {
            if (s.equals("") || s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }

        StringBuffer res = new StringBuffer();
        for (String word : stack) {
            res.append("/").append(word);
        }

        return res.length() == 0 ? "/" : res.toString();
    }
}

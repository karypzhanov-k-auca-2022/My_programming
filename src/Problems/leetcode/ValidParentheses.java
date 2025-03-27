package Problems.leetcode;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) { // is odd
            return false;
        }

        char[] stack = new char[s.length()];
        int top = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[top++] = c;
            } else if (top == 0) {
                return false;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            } else if (c == '}' && stack[--top] != '{') {
                return false;
            }
        }

        return top == 0;
    }
}

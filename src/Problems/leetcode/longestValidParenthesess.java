package Problems.leetcode;

import java.util.Stack;

public class longestValidParenthesess {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // base for valid substring
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // push index of '('
            } else {
                stack.pop(); // pop matching '('
                if (stack.isEmpty()) {
                    stack.push(i); // reset base
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
    
    public static void main(String[] args) {
        longestValidParenthesess lvp = new longestValidParenthesess();
        String s = "(()())";
        System.out.println("Longest valid parentheses length: " + lvp.longestValidParentheses(s));
    }
}



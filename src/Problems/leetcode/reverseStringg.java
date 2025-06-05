package Problems.leetcode;

public class reverseStringg {
    public void reverseString(char[] s) {

        int right = s.length - 1;
        int left = 0;
        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;    
        }
    }

    public static void main(String[] args) {
        reverseStringg rs = new reverseStringg();
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        rs.reverseString(s);
        System.out.println(s);
    }
}

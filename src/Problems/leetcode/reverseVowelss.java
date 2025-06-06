package Problems.leetcode;

import java.util.Set;

public class reverseVowelss {

    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of(
                'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U');
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left <= right) {
            while (left < right && !vowels.contains(chars[left]))
                left++;
            while (left < right && !vowels.contains(chars[right]))
                right--;
                
            char tmp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = tmp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
            String wo = "IceCreAm";
            reverseVowelss reverseVowelss = new reverseVowelss();

            System.out.println(reverseVowelss.reverseVowels(wo));
    }
}
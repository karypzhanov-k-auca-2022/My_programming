package Problems.leetcode;

public class lengthOfLastWordd {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        lengthOfLastWordd test1 = new lengthOfLastWordd();

        System.out.println(test1.lengthOfLastWord("   fly me   to   the moon  "));
    }
}

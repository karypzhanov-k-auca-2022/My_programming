package Problems.leetcode;

public class strStrr {
    public int strStr(String haystack, String needle) {
        if (haystack.equals("") || needle.equals("")
                || haystack.isBlank() || haystack.isEmpty()
                || needle.isBlank() || needle.isEmpty()) {
            return -1;
        }

        if(haystack.equals(needle)){
            return 0;
        }

        int res = -1;

        for (int i = 0; i < haystack.length(); i++) {
            StringBuffer partForCheck = new StringBuffer();
            int sizeToCopy = needle.length();
            int start = i;

            while (sizeToCopy != 0 && start != haystack.length()) {
                partForCheck.append(haystack.charAt(start++));
                sizeToCopy--;
            }

            if (partForCheck.toString().equals(needle)) {
                res = i;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        strStrr strStrr = new strStrr();
        System.out.println(strStrr.strStr("abc", "c"));
    }
}

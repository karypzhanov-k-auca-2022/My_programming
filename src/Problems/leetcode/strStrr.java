package Problems.leetcode;

public class strStrr {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
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

    public int strStr2(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        int maxStartIndex = haystackLength - needleLength;
        for (int i = 0; i <= maxStartIndex; i++) {
            String suffix = haystack.substring(i, haystackLength);

            boolean startsWithNeedle = suffix.startsWith(needle);
            if (startsWithNeedle) {
                return i;
            }
        }

        return -1;
    }

    public int strStr3(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        strStrr strStrr = new strStrr();
        System.out.println(strStrr.strStr("abc", "c"));
        System.out.println(strStrr.strStr2("hello", "ll"));
        System.out.println(strStrr.strStr3("sadasdasdasdsall", "ll"));
    }
}

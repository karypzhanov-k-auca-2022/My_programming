package Problems.leetcode;

public class isIsomorphicc {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i = 0; i < tMap.length; i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (sMap[cs] == 0 && tMap[ct] == 0) {
                sMap[cs] = ct;
                tMap[ct] = cs;
            } else if (sMap[cs] != ct || tMap[ct] != cs) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isIsomorphicc iso = new isIsomorphicc();
        System.out.println(iso.isIsomorphic("egg", "add")); // true
        System.out.println(iso.isIsomorphic("foo", "bar")); // false
        System.out.println(iso.isIsomorphic("paper", "title")); // true
    }
}

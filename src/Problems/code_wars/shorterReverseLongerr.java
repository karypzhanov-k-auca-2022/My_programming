package Problems.code_wars;

public class shorterReverseLongerr {

    public static String shorterReverseLonger(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return "";
        }

        StringBuffer result = new StringBuffer();
        boolean isAShort;

        if (a.length() >= b.length()) {
            isAShort = false;
        } else {
            isAShort = true;
        }

        if (isAShort) {
            StringBuffer reversed = new StringBuffer(b).reverse();
            result.append(a).append(reversed).append(a);
        } else {
            StringBuffer reversed = new StringBuffer(a).reverse();
            result.append(b).append(reversed).append(b);
        }

        return result.toString();
    }
}

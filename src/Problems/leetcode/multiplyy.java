package Problems.leetcode;

public class multiplyy {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int rest = Math.abs(num1.length() - num2.length());
        StringBuffer num11 = new StringBuffer(num1);
        StringBuffer num22 = new StringBuffer(num2);

        if (num1.length() < num2.length()) {
            for (int i = 0; i < rest; i++)
                num11.insert(0, '0');
        } else if (num1.length() > num2.length()) {
            for (int i = 0; i < rest; i++)
                num22.insert(0, '0');
        }

        int n = num22.length();
        String[] lines = new String[n];
        int countLines = 0;
        for (int i = n - 1; i >= 0; i--) {
            StringBuilder currLineRes = new StringBuilder();
            int carry = 0;
            int d2 = num22.charAt(i) - '0';
            for (int j = num11.length() - 1; j >= 0; j--) {
                int d1 = num11.charAt(j) - '0';
                int prod = d1 * d2 + carry;
                currLineRes.insert(0, prod % 10);
                carry = prod / 10;
            }
            if (carry > 0) {
                currLineRes.insert(0, carry);
            }
            lines[countLines++] = currLineRes.toString();
        }

        String result = "0";
        for (int k = 0; k < countLines; k++) {
            StringBuilder shifted = new StringBuilder(lines[k]);
            for (int z = 0; z < k; z++)
                shifted.append('0');
            result = addStrings(result, shifted.toString());
        }

        while (result.length() > 1 && result.charAt(0) == '0') {
            result = result.substring(1);
        }

        return result;
    }

    private String addStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j--) - '0' : 0;
            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        multiplyy solver = new multiplyy();
        System.out.println(solver.multiply("9", "9"));
    }
}
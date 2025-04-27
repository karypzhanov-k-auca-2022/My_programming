package Problems.leetcode;

import java.util.ArrayList;

public class multiplyy {
    public String multiply(String num1, String num2) {
        int rest = Math.abs(num1.length() - num2.length());

        StringBuffer num11 = new StringBuffer(num1);
        StringBuffer num22 = new StringBuffer(num2);

        if (num1.length() < num2.length()) {
            for (int i = 0; i < rest; i++) {
                num11.insert(0, "0");
            }
        } else if (num1.length() > num2.length()) {
            for (int i = 0; i < rest; i++) {
                num22.insert(0, "0");
            }
        }

        String[] lines = new String[num22.length()];
        int countLines = 0;

        for (int i = num22.length() - 1; i >= 0; i--) {
            StringBuffer currLineRes = new StringBuffer();
            int remainder = 0;
            int res = 0;

            char cOne = num22.charAt(i);
            int curr1 = Character.getNumericValue(cOne);

            for (int j = num11.length() - 1; j >= 0; j--) {
                char cTwo = num11.charAt(j);
                int curr2 = Character.getNumericValue(cTwo);
                res += (curr1 * curr2);

                if (res >= 10) {
                    remainder = res / 10;
                    currLineRes.insert(0, String.valueOf(res % 10));
                } else {
                    currLineRes.insert(0, String.valueOf(res));
                }
                res = remainder;
                remainder = 0;
            }

            lines[countLines] = currLineRes.toString();
            countLines++;
        }

        System.out.println(1);
        return "";
    }

    public static void main(String[] args) {
        multiplyy multiplyy1 = new multiplyy();

        String num1 = "123888";
        String num2 = "456";

        System.out.println(multiplyy1.multiply(num1, num2));

        System.out.println(28 / 10);
    }
}

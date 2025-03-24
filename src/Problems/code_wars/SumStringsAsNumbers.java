package Problems.code_wars;

import java.util.ArrayList;

public class SumStringsAsNumbers {
    public static String sumStrings(String a, String b) {
        String res = "";

        // delete zeros at the beginning
        a = a.replaceFirst("^0+(?!$)", "");
        b = b.replaceFirst("^0+(?!$)", "");

        long left = 0;
        boolean leftIsLonger = false;

        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                left = a.length() - b.length();
                leftIsLonger = true;
            } else {
                left = b.length() - a.length();
            }
        }

        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();

        // add zeros to the beginning of the shorter number
        if (leftIsLonger) {
            for (int i = 0; i < left; i++) {
                bb.add(0);
            }
        } else {
            for (int i = 0; i < left; i++) {
                aa.add(0);
            }
        }

        // add numbers to the array
        for (int i = 0; i < a.length(); i++) {
            aa.add(Integer.parseInt(String.valueOf(a.charAt(i))));
        }
        for (int i = 0; i < b.length(); i++) {
            bb.add(Integer.parseInt(String.valueOf(b.charAt(i))));
        }

        int carry = 0;

        // take the last number of the array and add them
        for (int i = aa.size() - 1; i >= 0; i--) {
            int sum = aa.get(i) + bb.get(i) + carry;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            res = sum + res;
        }

        // if there is a carry left, add it to the result
        if (carry > 0) {
            res = carry + res;
        }

        return res;
    }

    public static void main(String[] args) {
       System.out.println(sumStrings("123", "456"));
    }
}
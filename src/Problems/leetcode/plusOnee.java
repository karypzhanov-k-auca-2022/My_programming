package Problems.leetcode;

public class plusOnee {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; 

        for (int i = n - 1; i >= 0; i--) {
            digits[i] += carry; // add from the rightmost digit
            if (digits[i] == 10) {
                digits[i] = 0; // if > 9, set to 0
                carry = 1;
            } else {
                carry = 0;
            }
        }

        if (carry == 1) { // if there's still a carry
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1; 
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1]; // Copy the rest of the digits
            }
            return newDigits;
        }

        return digits; // Return the modified array
    }
}

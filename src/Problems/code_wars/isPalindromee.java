package Problems.code_wars;

public class isPalindromee {
    public boolean isPalindrome(String s) {
        String cleaned = s
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        if (cleaned.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = cleaned.length() - 1;
        int mid = cleaned.length() - 1;

        StringBuilder l = new StringBuilder();
        StringBuilder r = new StringBuilder();

        while (mid != -1) {
            l.append(cleaned.charAt(left));
            r.append(cleaned.charAt(right));
            left++;
            right--;
            mid--;

            String wordL = l.toString();
            String wordR = r.toString();
            if (wordL.equals(wordR)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String w = "A man, a plan, a canal: Panama";
        isPalindromee test1 = new isPalindromee();
        System.out.println(test1.isPalindrome(w));

        String w2 = "race a car";
        System.out.println(test1.isPalindrome(w2));
    }
}

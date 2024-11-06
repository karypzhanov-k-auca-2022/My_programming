package codewars;

import java.util.*;

public class problems {

    public static boolean isIsogram(String str) {
        String optimisedAnswer = str.toLowerCase();
        ArrayList<Character> letters = new ArrayList<>();

        for (char c : optimisedAnswer.toCharArray()) {
            letters.add(c);
        }

        for (int i = 0; i < optimisedAnswer.length(); i++) {
            for (int j = i + 1; j < optimisedAnswer.length(); j++) {
                if (optimisedAnswer.charAt(i) == optimisedAnswer.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int duplicateCount(String text) {
        String optAnswer = text.toLowerCase();
        HashMap<Character, Integer> letters = new HashMap<>();

        for (char c : optAnswer.toCharArray()) {
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }

        int duplicateCount = 0;

        for (int count : letters.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }

    public static String solution(String str) {

        StringBuffer t = new StringBuffer(str);
        t.reverse();
        String g = t.toString();
        return g;
    }

    public static String greet() {
        return "hello world";
    }

    public static int stringToNumber(String str) {
        int res = Integer.parseInt(str);
        return res;
    }

    public static int sum(int[] arr) {
        int res = 0;

        for (int n : arr) {
            if (n < 0) {
                continue;
            }
            res += n;
        }
        return res;
    }

    public int Liters(double time) {
        return (int) Math.floor(time / 0.5);
    }

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + Integer.toString((names.length) - 2)
                        + " others like this";
        }
    }

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        String[] words = phrase.split(" ");
        StringBuffer finalText = new StringBuffer();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {

                if (i == 0) {
                    char newC = word.charAt(i);
                    finalText.append(Character.toUpperCase(newC));
                } else {
                    finalText.append(word.charAt(i));
                }
            }
            finalText.append(" ");
        }
        return finalText.toString().trim();
    }

    public static int getCount(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        for (char c : str.toCharArray()) {
            for (char k : vowels) {
                if (c == k) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public int GetSum(int a, int b) {
        if (a > b) {
            int temp = a;
            b = a;
            b = temp;
        }
        int res = 0;
        for (int i = a; i <= b; i++) {
            res += i;
        }
        return res;
    }

    public static String longest(String s1, String s2) {
        StringBuffer answer = new StringBuffer();
        String combined = s1 + s2;

        Set<Character> uniqOnes = new TreeSet<>();

        for (char c : combined.toCharArray()) {
            uniqOnes.add(c);
        }

        for (char c : uniqOnes) {
            answer.append(c);
        }

        return answer.toString();
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static int sortDesc(final int num) {
        if (num == 0) {
            return 0;
        }

        ArrayList<Integer> digits = new ArrayList<>();
        int temp = num;

        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }

        digits.sort(Collections.reverseOrder());

        String res = "";
        for (int n : digits) {
            String s = Integer.toString(n);
            res += s;
        }

        return Integer.parseInt(res);
    }

    public static boolean isValid(char[] walk) {
        boolean answer = false;

        if (walk.length != 10) {
            return false;
        }

        int x = 0;
        int y = 0;

        for (char c : walk) {
            switch (c) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
            }
        }

        if (x == 0 && y == 0) {
            answer = true;
        }
        return answer;
    }

    public static String abbrevName(String name) {
        StringBuffer answer = new StringBuffer();
        String[] divided = name.split(" ");

        for (int i = 0; i < divided.length; i++) {
            char letter = divided[i].charAt(0);
            answer.append(letter);

            if (i == 0) {
                answer.append(".");
            }
        }

        return answer.toString().toUpperCase();
    }

    public static double findUniq(double arr[]) {
        double ans = 0;
        HashMap<Double, Integer> numbers = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            numbers.put(arr[i], numbers.getOrDefault(arr[i], 0) + 1);
        }

        for (double n : numbers.keySet()) {
            if (numbers.get(n) == 1) {
                ans = n;
                break;
            }
        }

        return ans;
    }

    public static int persistence(long n) {
        if (n <= 10) {
            return 0;
        }

        int count = 0;

        while (n >= 10) {
            long prod = 1;
            long temp = n;

            while (temp > 0) {
                prod *= (temp % 10);
                temp /= 10;
            }

            n = prod;
            count++;
        }

        return count;
    }

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] divided = words.split(" ");
        HashMap<Integer, String> ordered = new HashMap<>();

        for (String word : divided) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    int num = Character.getNumericValue(c);
                    ordered.put(num, word);
                }
            }
        }

        StringBuffer answer = new StringBuffer();

        for (int i = 1; i <= divided.length; i++) {
            answer.append(ordered.get(i));
            answer.append(" ");
        }

        return answer.toString().trim();
    }
//             1
//         3     5
//      7     9    11
//     13    15    17    19
// 21    23    25    27    29   

    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

    public static String noSpace(final String x) {
        return x.trim().replaceAll(" ", "");
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += Math.pow(n[i], 2);
        }

        return sum;
    }

    public static boolean validatePin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }

        for (char c : pin.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
      }

      public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == null) {
                continue;
            }

            if (haystack[i].toString().equals("needle")) {
                return "found the needle at position " + i;
            }
        }

        return "";
      }

      public static String repeatStr(final int repeat, final String string) {
    
        StringBuffer answer = new StringBuffer();
    
        for (int i = 0; i < repeat; i++) {
          answer.append(string);
        }
    
        return answer.toString();
      }

      public static int[] map(int[] arr) {
        int[] answer = new int[arr.length];
    
        for (int i = 0; i < arr.length; i++) {
          answer[i] = arr[i] * 2;
        }
    
        return answer;
      }
}
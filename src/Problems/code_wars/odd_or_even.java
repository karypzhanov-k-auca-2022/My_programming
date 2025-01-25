package Problems.code_wars;

public class odd_or_even {
    public static String oddOrEven (int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
        sum += array[i];
      }
      return sum % 2 == 0 ? "even" : "odd";
    }
  }
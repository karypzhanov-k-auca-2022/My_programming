public class oddOrEven {
    public static String oddOrEven (int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
        sum += array[i];
      }
      return sum % 2 == 0 ? "even" : "odd";
    }
  }
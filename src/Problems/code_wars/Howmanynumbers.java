package Problems.code_wars;

import java.util.ArrayList;
import java.util.List;

public class Howmanynumbers {
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        List<Long> result = new ArrayList<>();
        List<Long> numbers = new ArrayList<>();

        generateNumbers(numbers, 0, sumDigits, numDigits, 1);

        // Если нет подходящих чисел, возвращаем пустой список
        if (numbers.isEmpty()) {
            return result;
        }

        // add smallest and largest numbers
        long min = numbers.get(0);
        long max = numbers.get(numbers.size() - 1);

        // add count, min and max
        result.add((long) numbers.size());
        result.add(min);
        result.add(max);

        return result;
    }

    private static void generateNumbers(List<Long> numbers, long currentNumber, int remainingSum, int remainingDigits,
            int startDigit) {
        // if there are no more digits to generate
        if (remainingDigits == 0) {
            if (remainingSum == 0) {
                numbers.add(currentNumber);
            }
            return;
        }

        // numbers are in range 1-9
        for (int digit = startDigit; digit <= 9; digit++) {
            // if we can use current digitthen continue generating numbers
            if (remainingSum - digit >= 0) {
                generateNumbers(numbers, currentNumber * 10 + digit, remainingSum - digit, remainingDigits - 1, digit);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(findAll(10, 3));
    }
}

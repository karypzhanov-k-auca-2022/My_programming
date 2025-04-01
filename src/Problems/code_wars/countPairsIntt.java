package Problems.code_wars;

public class countPairsIntt {
    public static int countPairsInt(int diff, long nMax) {
        int count = 0;
        
        for (long i = 1; i + diff < nMax; i++) {
            if (calculateDivisors(i) == calculateDivisors(i + diff)) {
                count++;
            }
        }
        
        return count;
    }
    
    private static int calculateDivisors(long number) {
        int count = 0;
        for (long i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairsInt(1, 50));
        System.out.println(countPairsInt(3, 100));

        System.out.println(calculateDivisors(21));
    }
}

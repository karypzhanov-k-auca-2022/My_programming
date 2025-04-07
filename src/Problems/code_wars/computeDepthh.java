package Problems.code_wars;

public class computeDepthh {
    public int computeDepth(int n) {
        boolean[] seen = new boolean[10];
        int countSeen = 0;
        int multiplier = 0;

        while (countSeen < 10) {
            multiplier++;
            int product = n * multiplier;
            while (product > 0) {
                int digit = product % 10;
                if (!seen[digit]) {
                    seen[digit] = true;
                    countSeen++;
                }
                product /= 10;
            }
        }
        return multiplier;
    }

    public static void main(String[] args) {
        computeDepthh obj = new computeDepthh();
        int n = 42; // Example input
        int result = obj.computeDepth(n);
        System.out.println("for n = " + n + ", the multiplier is: " + result);
    }
}

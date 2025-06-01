package Problems.code_wars;

import java.math.BigInteger;


public class AllNiness {
    public static BigInteger allNines(BigInteger x) {
        if (x.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            return BigInteger.valueOf(-1);
        }

        BigInteger m = BigInteger.ONE;
        BigInteger nine = BigInteger.valueOf(9);
        BigInteger product;

        while (true) {
            product = x.multiply(m);
            String productStr = product.toString();

           
            if (productStr.matches("9+")) {
                return m;
            }

            m = m.add(BigInteger.ONE);
        }
    }
}

package Problems.code_wars;

public class BattleOfTheCharacterss {
    public static String battle(final String x, final String y) {
        String winner = "Tie!";
        StringBuffer w1 = new StringBuffer();
        StringBuffer w2 = new StringBuffer();

        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.toUpperCase().charAt(i);
            w1.append(c);
            res1 += c - 'A';
        }

        for (int i = 0; i < y.length(); i++) {
            char c = y.toUpperCase().charAt(i);
            w2.append(c);
            res2 += c - 'A';
        }

        if (res1 > res2) {
            return w1.toString();
        } else if (res1 < res2) {
            return w2.toString();
        }

        return winner;
    }
}

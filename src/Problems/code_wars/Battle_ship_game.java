package Problems.code_wars;

import java.util.HashMap;
import java.util.Map;

public class Battle_ship_game {

    public static void main(String[] args) {

        int[][] board = new int[][] {
                { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 1, 0 }
        };

        int[][] attacks = new int[][] {
                { 3, 1 },
                { 3, 2 },
                { 3, 3 }
        };

        System.out.println(damagedOrSunk(board, attacks));
    }

    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        Map<String, Double> result = new HashMap<>();
        Map<Integer, Integer> initialShips = new HashMap<>();
        Map<Integer, Integer> remainingShips = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    initialShips.put(board[i][j], initialShips.getOrDefault(board[i][j], 0) + 1);
                }
            }
        }

        // attack
        for (int[] attack : attacks) {
            int x = attack[0] - 1; // (3, 1) -> (2, 2)
            int y = board.length - attack[1]; // (3, 2) -> (2, 1)

            // hit
            if (y >= 0 && y < board.length && x >= 0 && x < board[0].length && board[y][x] > 0) {
                board[y][x] = 0; // hit
            }
        }

        // count remaining ships
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    remainingShips.put(board[i][j], remainingShips.getOrDefault(board[i][j], 0) + 1);
                }
            }
        }

        int sunk = 0;
        int damaged = 0;
        int notTouched = 0;
        double points = 0.0;

        // check the result
        for (Integer shipType : initialShips.keySet()) {
            int initial = initialShips.get(shipType);
            int remaining = remainingShips.getOrDefault(shipType, 0);

            if (remaining == 0) {
                sunk++;
                points++;
            } else if (remaining < initial) {
                damaged++;
                points += 0.5;
            } else {
                notTouched++;
                points--;
            }
        }

        // output
        result.put("sunk", (double) sunk);
        result.put("damaged", (double) damaged);
        result.put("notTouched", (double) notTouched);
        result.put("points", points);

        return result;
    }
}

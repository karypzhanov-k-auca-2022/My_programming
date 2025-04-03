package Problems.code_wars;

public class Codewars_style_ranking_system {
    public class User {
        public int rank;
        public int progress;

        public User() {
            this.rank = -8;
            this.progress = 0;
        }

        public void incProgress(int rankActivity) {
            if (rankActivity < -8 || rankActivity > 8 || rankActivity == 0) {
                throw new IllegalArgumentException("Invalid");
            }

            // if max
            if (rank == 8) {
                return;
            }

            int rankDifference;
            if (rankActivity > 0 && rank < 0) { // rankActivity is positive and rank is negative
                rankDifference = rankActivity - rank - 1;
            } else if (rankActivity < 0 && rank > 0) { // rankActivity is negative and rank is positive
                rankDifference = rankActivity - rank + 1;
            } else { // rankActivity and rank are both positive or both negative
                rankDifference = rankActivity - rank;
            }

            int earnedPoints;
            if (rankDifference == 0) {
                earnedPoints = 3;
            } else if (rankDifference == -1) {
                earnedPoints = 1;
            } else if (rankDifference < -1) {
                earnedPoints = 0;
            } else {
                earnedPoints = 10 * rankDifference * rankDifference;
            }

            progress += earnedPoints;

            while (progress >= 100 && rank < 8) {
                progress -= 100;
                rank++;

                if (rank == 0) {
                    this.rank = 1;
                }
            }
            
            if (rank == 8) {
                progress = 0;
            }
        }
    }
}

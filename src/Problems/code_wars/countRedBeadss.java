package Problems.code_wars;

public class countRedBeadss {
    public static int countRedBeads(final int nBlue) {

        if (nBlue < 2){
            return 0;
        }
        int red;

        red = (nBlue - 1) * 2;
        return red;
      }
}

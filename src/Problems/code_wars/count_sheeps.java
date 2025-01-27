package Problems.code_wars;

public class count_sheeps {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int sheeps = 0;

        for (Boolean is_sheep_there : arrayOfSheeps) {
            if (is_sheep_there != null && is_sheep_there)
                sheeps++;
        }

        return sheeps;
    }
}

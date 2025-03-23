package Problems.code_wars;

import java.util.ArrayList;

public class Emotional_sort {
    public static String[] sortEmotions(boolean order, String[] emotions) {
        ArrayList<String> result = new ArrayList<>();
        String[] tableOfEmotions = { ":D", ":)", ":|", ":(", "T_T" };
        String[] res = new String[emotions.length];

        if (order) {
            for (int i = 0; i < tableOfEmotions.length; i++) {
                for (int j = 0; j < emotions.length; j++) {
                    if (tableOfEmotions[i].equals(emotions[j])) {
                        result.add(emotions[j]);
                    }
                }
            }
        } else {
            for (int i = tableOfEmotions.length - 1; i >= 0; i--) {
                for (int j = 0; j < emotions.length; j++) {
                    if (tableOfEmotions[i].equals(emotions[j])) {
                        result.add(emotions[j]);
                    }
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        String[] array = { ":D", ":|", ":)", ":(", ":D" };

        String[] result1 = sortEmotions(false, array);
        String[] result2  = sortEmotions(true, array);

        for (String n : result1) {
            System.out.println(n);
        }

        System.out.println("---");
       for (String n : result2) {
            System.out.println(n);
        }
    }
}

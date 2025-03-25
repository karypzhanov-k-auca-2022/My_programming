package Problems.code_wars;

import java.util.ArrayList;
import java.util.List;

public class SoManyPermutations {
    public static List<String> singlePermutations(String s) {
        List<String> permutations = new ArrayList<>();

        if (s.length() == 1) {
            permutations.add(s);
            return permutations;
        }

        if(s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            permutations.add(s);
            return permutations;
        } else if(s.length() == 2) {
            permutations.add(s);
            permutations.add(s.charAt(1) + "" + s.charAt(0));
            return permutations;
        }

        for (int i = 0; i < s.length(); i++) {
            String shorter = s.substring(0, i) + s.substring(i + 1);

            for (String perm : singlePermutations(shorter)) {
                String variant = s.charAt(i) + perm;

                if (!permutations.contains(variant)) {
                    permutations.add(variant);
                }

            }
        }

        return permutations;
}

    public static void main(String[] args) {
        System.out.println(singlePermutations("a"));
        System.out.println(singlePermutations("ab"));
        System.out.println(singlePermutations("dddsaa"));
    }
}

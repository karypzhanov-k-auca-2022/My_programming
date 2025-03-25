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
            
            int indexToRemove = 0;

            for (int i = 0; i < s.length(); i++) {
                String newString = s.substring(0, indexToRemove) + s.substring(indexToRemove + 1);
                List<String> newPermutations = singlePermutations(newString);

                for (String permutation : newPermutations) {
                    permutations.add(s.charAt(indexToRemove) + permutation);
                }
                
                indexToRemove++;
            }
            return permutations;
    }

    public static void main(String[] args) {
        System.out.println(singlePermutations("a"));
        System.out.println(singlePermutations("ab"));
        System.out.println(singlePermutations("abc"));
        System.out.println(singlePermutations("aabb"));
    }
}

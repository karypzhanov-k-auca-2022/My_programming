package Problems.code_wars;

public class StringSplitt {
    public static String[] solution(String s) {
        
        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] result = new String[s.length() / 2];

        int index = 0;
        for (int i = 0; i < s.length(); i += 2) {
            result[index] = s.substring(i, i + 2);
            index++;
        }

        return result;
    }
}

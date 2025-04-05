package Problems.code_wars;

public class scrollingTextt {
    public static String[] scrollingText(String text) {
        String[] res = new String[text.length()];
        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            res[i] = text.substring(i) + text.substring(0, i);
        }

        return res;
    }

    public static void main(String[] args) {
        String[] result = scrollingText("codewars");
        for (String str : result) {
            System.out.println(str);
        }
    }
}
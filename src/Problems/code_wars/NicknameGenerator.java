package Problems.code_wars;

public class NicknameGenerator {
    public static String nickname(String name) {
        String nickname = "";

        if (name.length() < 4) {
            return "Error: Name too short";
        }

        if (name.length() == 4){
            nickname = name.substring(0, 3);
        }


        if (name.length() > 4) {
            if (name.charAt(2) == 'a' || name.charAt(2) == 'e' || name.charAt(2) == 'i' || name.charAt(2) == 'o'
                    || name.charAt(2) == 'u') {
                nickname = name.substring(0, 4);
            } else {
                nickname = name.substring(0, 3);
            }
        }

        return nickname;
    }

    public static void main(String[] args) {
        System.out.println(nickname("Hans"));
    }
}

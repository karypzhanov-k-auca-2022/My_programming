package Problems.code_wars;

public class obfuscatee {
    public static String obfuscate(String email) {
        StringBuffer res = new StringBuffer();

        for (int i = 0; i < email.length(); i++) {
            char letter = email.charAt(i);
            if (letter == '@') {
                res.append(" [at] ");
            } else if(letter == '.'){
                res.append(" [dot] ");
            } else{
                res.append(letter);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(obfuscate("jim.kuback@ennerman-hatano.com"));
    }
}

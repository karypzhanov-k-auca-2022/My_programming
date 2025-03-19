package Problems.code_wars;

public class alphanumeric {
    public static void main(String[] args) {
        System.out.println(alphanumeric("PassW0rd"));
    }

    public static boolean alphanumeric(String str) {
        boolean isAlphaNumeric = true;

        if (isAlphaNumeric) {
            isAlphaNumeric = str.matches("[a-zA-Z0-9]+"); // checks if the string contains only letters and digits
        }

        return isAlphaNumeric;
    }

}

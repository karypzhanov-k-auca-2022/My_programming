package Problems.code_wars;
import java.util.regex.Pattern;

public class RegexPasswordValidation {

class PasswordRegex {
    // Регулярное выражение, объединяющее все проверки
    static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
}
}

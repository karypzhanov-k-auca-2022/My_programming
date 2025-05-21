package practice.StringsPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        // 1. \d — цифровой символ (0–9)
        System.out.println("5".matches("\\d")); // true
        System.out.println("a".matches("\\d")); // false

        // 2. \D — любой НЕ-цифровой символ
        System.out.println("X".matches("\\D")); // true
        System.out.println("7".matches("\\D")); // false

        // 3. \s — пробельный символ (space, tab, newline и т. п.)
        System.out.println(" ".matches("\\s")); // true
        System.out.println("a".matches("\\s")); // false

        // 4. \S — любой НЕ-пробельный символ
        System.out.println("a".matches("\\S")); // true
        System.out.println("\n".matches("\\S")); // false

        // 5. \w — «слово»: буква, цифра или _
        System.out.println("A".matches("\\w")); // true
        System.out.println("7".matches("\\w")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println("-".matches("\\w")); // false

        // 6. \W — НЕ-слово: всё, что не [A-Za-z0-9_]
        System.out.println("-".matches("\\W")); // true
        System.out.println("B".matches("\\W")); // false

        // 7. . (dot) — любой символ, КРОМЕ перевода строки (\n) по умолчанию
        System.out.println("x".matches(".")); // true
        System.out.println("\n".matches(".")); // false

        // Пример поиска всех цифр и букв-слов подряд через Matcher:
        String text = "ID: A123, code *Z9_!*";
        Pattern p = Pattern.compile("\\d+"); // ищем подряд идущие цифры
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Found digits: " + m.group());
        }

        p = Pattern.compile("\\w+"); // ищем подряд идущие 'слова'
        m = p.matcher(text);
        while (m.find()) {
            System.out.println("Found word:   " + m.group());
        }
    }
}

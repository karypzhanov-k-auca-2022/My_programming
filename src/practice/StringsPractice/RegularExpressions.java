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

        System.out.println("---------------------------------------");

        // Prepare test strings containing each delimiter character
        String tab = "\t";
        String newline = "\n";
        String cr = "\r";
        String formFeed = "\f";
        String nlUnicode = "\u0085";
        String lsUnicode = "\u2028";
        String psUnicode = "\u2029";

        // 1. \t — табуляция
        System.out.println("Tab matches '\\t': " + tab.matches("\\t"));

        // 2. \n — новая строка
        System.out.println("Newline matches '\\n': " + newline.matches("\\n"));

        // 3. \r — возврат каретки
        System.out.println("Carriage return matches '\\r': " + cr.matches("\\r"));

        // 4. \f — перевод страницы (form feed)
        System.out.println("Form feed matches '\\f': " + formFeed.matches("\\f"));

        // 5. \u0085 — next line (NEL) Unicode
        System.out.println("Unicode NEL matches '\\u0085': " + nlUnicode.matches("\\u0085"));

        // 6. \u2028 — line separator (LS) Unicode
        System.out.println("Unicode LS matches '\\u2028': " + lsUnicode.matches("\\u2028"));

        // 7. \u2029 — paragraph separator (PS) Unicode
        System.out.println("Unicode PS matches '\\u2029': " + psUnicode.matches("\\u2029"));

        // Более реальный пример: поиск в тексте
        String textString = "First line\nSecond line\r\nThird\u2028Fourth";
        Pattern pp = Pattern.compile("\\n"); // ищем символ новой строки
        Matcher mm = pp.matcher(textString);
        System.out.print("Found newlines at positions:");
        while (mm.find()) {
            System.out.print(" " + mm.start());
        }
        System.out.println();

        System.out.println("---------------------------------------");

        // 1. [abc] — любой символ из перечисленных (a, b или c)
        System.out.println("'a' matches [abc]: " + "a".matches("[abc]")); // true
        System.out.println("'d' matches [abc]: " + "d".matches("[abc]")); // false

        // 2. [^abc] — любой символ, кроме перечисленных (не a, не b, не c)
        System.out.println("'d' matches [^abc]: " + "d".matches("[^abc]")); // true
        System.out.println("'a' matches [^abc]: " + "a".matches("[^abc]")); // false

        // 3. [a-zA-Z] — диапазон символов от a до z и от A до Z (латиница без учёта
        // регистра)
        System.out.println("'M' matches [a-zA-Z]: " + "M".matches("[a-zA-Z]")); // true
        System.out.println("'5' matches [a-zA-Z]: " + "5".matches("[a-zA-Z]")); // false

        // 4. [a-d[m-p]] — объединение двух диапазонов: от a до d и от m до p
        System.out.println("'b' matches [a-d[m-p]]: " + "b".matches("[a-d[m-p]]")); // true (b∈a–d)
        System.out.println("'n' matches [a-d[m-p]]: " + "n".matches("[a-d[m-p]]")); // true (n∈m–p)
        System.out.println("'e' matches [a-d[m-p]]: " + "e".matches("[a-d[m-p]]")); // false

        // 5. [a-z&&[def]] — пересечение: символы из a–z, но только те, что также в
        // [def] => d, e, f
        System.out.println("'d' matches [a-z&&[def]]: " + "d".matches("[a-z&&[def]]")); // true
        System.out.println("'b' matches [a-z&&[def]]: " + "b".matches("[a-z&&[def]]")); // false

        // 6. [a-z&&[^bc]] — из диапазона a–z вычитаем b и c => остаются все от a и d–z
        System.out.println("'a' matches [a-z&&[^bc]]: " + "a".matches("[a-z&&[^bc]]")); // true
        System.out.println("'b' matches [a-z&&[^bc]]: " + "b".matches("[a-z&&[^bc]]")); // false
        System.out.println("'d' matches [a-z&&[^bc]]: " + "d".matches("[a-z&&[^bc]]")); // true

        System.out.println("---------------------------------------");

        // 1. ? — zero or one occurrence of the preceding element
        // Pattern: "ab?" matches "a" or "ab"
        System.out.println("".matches("ab?"));    // false
        System.out.println("a".matches("ab?"));   // true (b is absent)
        System.out.println("ab".matches("ab?"));  // true (b is present)
        System.out.println("abb".matches("ab?")); // false (too many b)

        // 2. * — zero or more occurrences
        // Pattern: "ab*c" matches "ac", "abc", "abbbc", etc.
        System.out.println("ac".matches("ab*c"));      // true (zero b)
        System.out.println("abc".matches("ab*c"));     // true (one b)
        System.out.println("abbbbbc".matches("ab*c")); // true (many b)

        // 3. + — one or more occurrences
        // Pattern: "ab+c" matches "abc", "abbbc", but not "ac"
        System.out.println("ac".matches("ab+c"));      // false (needs ≥1 b)
        System.out.println("abc".matches("ab+c"));     // true
        System.out.println("abbbbbc".matches("ab+c")); // true

        // 4. {n} — exactly n occurrences
        // Pattern: "a{3}" matches "aaa"
        System.out.println("aa".matches("a{3}"));   // false
        System.out.println("aaa".matches("a{3}"));  // true
        System.out.println("aaaa".matches("a{3}")); // false

        // 5. {n,} — at least n occurrences
        // Pattern: "a{2,}" matches "aa", "aaa", "aaaa", ...
        System.out.println("a".matches("a{2,}"));      // false
        System.out.println("aa".matches("a{2,}"));     // true
        System.out.println("aaaaaaa".matches("a{2,}"));// true

        // 6. {n,m} — between n and m (inclusive) occurrences
        // Pattern: "a{2,4}" matches "aa", "aaa", "aaaa"
        System.out.println("a".matches("a{2,4}"));     // false
        System.out.println("aa".matches("a{2,4}"));    // true
        System.out.println("aaaa".matches("a{2,4}"));  // true
        System.out.println("aaaaa".matches("a{2,4}")); // false
    }
}

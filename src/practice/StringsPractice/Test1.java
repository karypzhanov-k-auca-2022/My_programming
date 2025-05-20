package practice.StringsPractice;

public class Test1 {
    public static void main(String[] args) {

        // String u = "TEST";
        // String v = "test";
        // System.out.println(u.equalsIgnoreCase(v)); // t

        String name = "Alice";
        int age = 30;
        double height = 165.45678;
        float weight = 55.789f;

        // Форматирование строки с ограничением до 3 знаков после точки
        String formatted = String.format("Name: %s, Age: %d, Height: %.3f, Weight: %.2f", name, age, height, weight);

        System.out.println(formatted);

        // 7. void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        String src = "abcdef";
        char[] buf = new char[3];
        src.getChars(2, 5, buf, 0); // копирует 'c','d','e'
        System.out.println(buf);

        String s2 = "banana banana";
        // Поиск индекса первого вхождения подстроки "banana"
        int index = s2.indexOf("banana");
        System.out.println(index); // Вывод: 0 (первое вхождение подстроки "banana" начинается с индекса 0)

        System.out.println();

        /*
         * Таким образом, это регулярное выражение проверяет, что строка:
         * 
         * Состоит из одной или более букв/цифр перед @.
         * Имеет символ @.
         * Состоит из одной или более букв/цифр после @ и перед ..
         * Имеет точку ..
         * Состоит из одной или более букв/цифр после точки.
         */

        String email = "user@example.com";
        System.out.println(email.matches("\\w+@\\w+\\.\\w+")); // true

        
    }
}
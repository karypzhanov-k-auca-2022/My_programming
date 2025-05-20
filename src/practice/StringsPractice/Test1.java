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

        String word = "ballllldsaddsaloon";
        System.out.println(word.replaceAll("l", "t")); // "battoondsaddsattoon"

        String text = "banana123";
        System.out.println(text.replaceAll("\\d", "*")); // "banana*****"

        System.out.println("hello".substring(2)); // "llo"

        // 19. String substring(int beginIndex, int endIndex)
        System.out.println("hello".substring(1, 4)); // "ell"

        // trim() - удаляет пробелы в начале и конце строки
        String str = "   Hello, World!   ";
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'"); // "Hello, World!"

        // Integer to string
        int number = 123;
        String numberString = Integer.toString(number);

        // String to integer
        String strNumber = "456";
        int stringToNumber = Integer.parseInt(strNumber);
        System.out.println("String to integer: " + stringToNumber); // 456

        // String to double
        String strDouble = "123.45";
        double stringToDouble = Double.parseDouble(strDouble);
        System.out.println("String to double: " + stringToDouble); // 123.45

        // double to string
        double doubleNumber = 789.01;
        String doubleToString = Double.toString(doubleNumber);
        System.out.println("Double to string: " + doubleToString); // "789.01"
        // String to float
        String strFloat = "123.45";
        float stringToFloat = Float.parseFloat(strFloat);
        System.out.println("String to float: " + stringToFloat); // 123.45
        // float to string
        float floatNumber = 456.78f;
        String floatToString = Float.toString(floatNumber);
        System.out.println("Float to string: " + floatToString); // "456.78"
        // String to boolean
        String strBoolean = "true";
        boolean stringToBoolean = Boolean.parseBoolean(strBoolean);
        System.out.println("String to boolean: " + stringToBoolean); // true
        // boolean to string
        boolean booleanValue = false;
        String booleanToString = Boolean.toString(booleanValue);
        System.out.println("Boolean to string: " + booleanToString); // "false"

        String bbbbbb = "Software And Hardware!";
        String res = bbbbbb.substring(9, 12);
        System.out.println(res); // "And"

        String str1 = "JavaDoc";
        String str3 = "DocJava";
        // compare J and D if the same then compare a and o nad return difference
        System.out.println(str1.compareTo(str3));



        System.out.println("------------------");
        // 1. capacity()
        StringBuilder sb1 = new StringBuilder();
        System.out.println("Initial capacity: " + sb1.capacity()); // default 16

        // 2. ensureCapacity(int minimumCapacity)
        sb1.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb1.capacity());

        // 3. setLength(int newLength)
        sb1.append("Hello");
        System.out.println("Content before setLength: '" + sb1 + "', length=" + sb1.length());
        sb1.setLength(10);
        System.out.println("After setLength(10):    '" + sb1 + "', length=" + sb1.length());
        sb1.setLength(3);
        System.out.println("After setLength(3):     '" + sb1 + "', length=" + sb1.length());

        // 4. append(…)
        StringBuilder sb2 = new StringBuilder("Start");
        sb2.append(" middle").append(" end").append(123).append(true);
        System.out.println("append examples: " + sb2);

        // 5. insert(…)
        StringBuilder sb3 = new StringBuilder("ABC");
        sb3.insert(1, "123");
        System.out.println("After insert(1, \"123\"): " + sb3);

        // 6. charAt(int index)
        char ch = sb3.charAt(2);
        System.out.println("charAt(2) of \"" + sb3 + "\": " + ch);

        // 7. delete(int start, int end)
        StringBuilder sb4 = new StringBuilder("Hello, World!");
        sb4.delete(5, 7); // removes ", "
        System.out.println("After delete(5,7): " + sb4);

        // 8. deleteCharAt(int index)
        sb4.deleteCharAt(5);
        System.out.println("After deleteCharAt(5): " + sb4);

        // 9. replace(int start, int end, String str)
        StringBuilder sb5 = new StringBuilder("Goodbye");
        sb5.replace(0, 4, "Hello");
        System.out.println("After replace(0,4,\"Hello\"): " + sb5);

        // 10. substring(int start)
        StringBuilder sb6 = new StringBuilder("substringTest");
        String sub1 = sb6.substring(3);
        System.out.println("substring(3): " + sub1);

        // 11. substring(int start, int end)
        String sub2 = sb6.substring(3, 8);
        System.out.println("substring(3,8): " + sub2);

        // 12. reverse()
        StringBuilder sb7 = new StringBuilder("reverse");
        sb7.reverse();
        System.out.println("After reverse(): " + sb7);
    }
}
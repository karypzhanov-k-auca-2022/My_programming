package practice;

public class methods_parameters {
    static void doJob(String... ss) {
        System.out.println("String...");
    }
    static void doJob(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob(String s1, String... str) {
        System.out.println("String, String...");
    }
    public static void main(String[] args) {
        // doJob("hi");
        // doJob("hi", "hi", "hi");
    }
}

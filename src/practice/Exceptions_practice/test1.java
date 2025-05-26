package practice.Exceptions_practice;

public class test1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Program Error!"); 
        }

        System.out.println("Program Ended Successfully!");
    }
}

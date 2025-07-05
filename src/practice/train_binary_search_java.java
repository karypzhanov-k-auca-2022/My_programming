package practice;
import java.util.Arrays;
import java.util.Scanner;

public class train_binary_search_java {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target < array[mid])
                high = mid - 1;
            else if (target > array[mid])
                low = mid + 1;
            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arrSize = 10;
        int[] libraryNum = { 108, 123, 124, 235, 285, 379, 456, 476, 756, 998 };
        int requiredNum = -1;
        int result = -2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("To exit enter 0.");
        while (requiredNum != 0) {
            System.out.print("Enter the library card number: ");
            requiredNum = scanner.nextInt();

            if (requiredNum == 0) {
                System.out.println("The search is over.");
            } else {
                if (requiredNum < 0) {
                    System.out.println("You entered an invalid customer library card number.");
                } else {
                    result = binarySearch(libraryNum, requiredNum);

                    if (result == -1) {
                        System.out.printf("The entered library card number %d was not found in the list.%n",
                                requiredNum);
                    } else {
                        System.out.printf("The entered library card number %d was found in index %d.%n", requiredNum,
                                result);
                    }
                }
            }
        }
    }
}

package practice.trash;
public class BinarySearchPractice {

    // Задача 1: Найти первое вхождение элемента
    public int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        int res = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    // Задача 2: Найти пик в горном массиве
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // finish when left == right
        return left;
    }

    // Задача 3: Поиск в циклически сдвинутом массиве
    public int search(int[] nums, int target) {
        // Ваш код здесь
        return -1;
    }

    // Задача 4: Минимальный элемент в циклически сдвинутом массиве
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    // Задача 5: Ближайший элемент
    public int findClosestElement(int[] nums, int target) {
        // Ваш код здесь
        return -1;
    }
}
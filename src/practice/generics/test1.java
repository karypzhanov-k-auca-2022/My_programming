package practice.generics;

public class test1 {

    static class DynamicArray<T> {
        private T[] arr = (T[]) new Object[0];

        public void addElement(T element) {

            T[] newArr = (T[]) new Object[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[arr.length] = element;
            arr = newArr;
        }

        public T getElement(int index) {
            return arr[index];
        }
    }

    public static void main(String[] args) {
        DynamicArray<Integer> intArray = new DynamicArray<>();
        intArray.addElement(1);
        intArray.addElement(2);

        System.out.println(intArray.getElement(0)); // Output: 1
        System.out.println(intArray.getElement(1)); // Output: 2
    }
}

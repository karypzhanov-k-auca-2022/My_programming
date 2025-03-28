package Problems.code_wars;

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            int j = i;
            while (j < arr.length - 1 && arr[j] + 1 == arr[j + 1]) j++;
            if (i + 1 < j) { // if there is a range just update the left index
                i = j;
                sb.append("-");
                sb.append(arr[i]); // add the right index
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1); // remove the last comma
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,6,7,9,11};
        System.out.println(rangeExtraction(arr));
    }
}

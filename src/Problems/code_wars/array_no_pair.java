package Problems.code_wars;

public class array_no_pair {
    public static int solve(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean isPair = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == -arr[j]) {
                    isPair = true;
                    break;
                }
            }

            if (!isPair) {
                return arr[i];
            }
            
        }
        return 0;
    }
}

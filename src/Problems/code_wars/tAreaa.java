package Problems.code_wars;

public class tAreaa {
    public static float tArea(String tStr) {
        String[] lines = tStr.split("\n");
         
        // count non-empty lines
        int count = 0;
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                count++; 
            }
        }
        
        int height = count - 1;
        
        int base = height;
        
        return (float) (base * height) / 2.0f;
    }
}

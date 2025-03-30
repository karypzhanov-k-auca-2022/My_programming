package practicee;

import java.util.ArrayList;
import java.util.List;

public class practice {
    int a = 1;
    static int b = 2;

    void abc( int a ){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(practice.b);
    }
    public static void main(String[] args) {
        practice t = new practice();
        t.abc(4);
    }
}

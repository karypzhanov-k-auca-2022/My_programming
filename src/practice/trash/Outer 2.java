package practice.trash;

public class Outer {
    void method() {
        
        class LocalClass{
            void display() {
                System.out.println("Inside LocalClass");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.display();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}

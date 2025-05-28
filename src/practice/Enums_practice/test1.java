package practice.Enums_practice;

enum BinaryOperation {
    PLUS("+") {
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    MINUS("-") {
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    DIVISION("/") {
        public int calculate(int a, int b) {
            return a / b;
        }
    },
    MULT("*") {
        public int calculate(int a, int b) {
            return a * b;
        }
    };

    String operation;

    public abstract int calculate(int a, int b);

    BinaryOperation(String operation) {
        this.operation = operation;
    }
}

public class test1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        for (BinaryOperation op : BinaryOperation.values()) {
            System.out.println(a + " " + op.operation + " " + b + " = " + op.calculate(a, b));
        }
    }
}

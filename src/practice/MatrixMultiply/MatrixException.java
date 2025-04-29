package practice.MatrixMultiply;

public class MatrixException extends Exception {
    public MatrixException() {
    }

    public MatrixException(String message) {
        super(message);
    }

    public MatrixException(Throwable cause) {
        super(cause);
    }

    public MatrixException(String message, Throwable cause) {
        super(message, cause);
    }
}

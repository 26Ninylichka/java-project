package lesson_30_interfaces;

public class StackIsEmptyException extends RuntimeException {
    public StackIsEmptyException(String message) {
        super(message);
    }
}

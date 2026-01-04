package lesson_30_interfaces;

public class StackIsFullException extends RuntimeException {
    public StackIsFullException(String message) {
        super(message);
    }
}

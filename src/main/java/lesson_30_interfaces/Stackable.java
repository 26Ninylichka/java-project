package lesson_30_interfaces;

public interface Stackable {

    boolean isEmpty();

    boolean isFull();

    void addElementToStack(int element) throws StackIsFullException;

    int deleteElementFromStack() throws StackIsEmptyException;

    int readTop() throws StackIsEmptyException;


}

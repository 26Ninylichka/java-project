package lesson_30_interfaces;

import java.util.Optional;

public interface Stackable {

    boolean isEmpty();

    boolean isFull();

    void addElementToStack(int element) throws StackIsFullException;

    int deleteElementFromStack() throws StackIsEmptyException;

    int readTop() throws StackIsEmptyException;

    Optional<Integer> reedTop();

}

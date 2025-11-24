package lesson_30_interfaces;

import java.util.Optional;

public class Stack implements Stackable {
    private int maxSize;
    private int[] stack;
    private int top;


    public Stack(int max) {
        this.maxSize = max;
        stack = new int[maxSize];
        top = -1;
    }


    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    @Override
    public void addElementToStack(int element) throws StackIsFullException {
        if (isFull()) {
            throw new StackIsEmptyException("Помилка: стек повний");
        }
        stack[++top] = element;
        System.out.println("Елемент " + element + " Додано у стек");

    }

    @Override
    public int deleteElementFromStack() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Помилка: стек пустий");
        }
        int deleted = stack[top--];
        System.out.println("Елемент: " + deleted + " Видалено із стека ");
        return deleted;
    }


    @Override
    public Optional<Integer> readTopOptional() {
        return Optional.empty();
    }

    @Override
    public int readTop() throws  StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Помилка: стек пустий");

        }
        return stack[top];
    }
}

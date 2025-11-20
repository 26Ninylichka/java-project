package lesson_30_interfaces;

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
    public void addElementToStack(int element) {
        if (isFull()) {
            System.out.println("Стек заповнений! Неможливо додати елемент");
            return;
        }
        stack[++top] = element;
        System.out.println("Елемент " + element + " Додано у стек");

    }

    @Override
    public int deleteElementFromStack() {
        if (isEmpty()) {
            System.out.println("Стек порожній. Нема що видаляти");
            return -1;
        }
        int deleted = stack[top--];
        System.out.println("Елемент: " + deleted + " Видалено із стека ");
        return deleted;
    }


    @Override
    public int readTop() {
        if (isEmpty()) {
            System.out.println("Стек порожній. Немає верхнього елемента");
            return -1;
        }
        return stack[top];
    }
}

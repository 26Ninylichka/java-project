package lesson_30_interfaces;

public class Main {
    static void main() {

        Stackable stack = new Stack(5);
        stack.addElementToStack(10);
        stack.addElementToStack(15);
        stack.addElementToStack(20);
        stack.addElementToStack(30);
        stack.addElementToStack(40);

        System.out.println("Верхній елемент " + stack.readTop());

        stack.deleteElementFromStack();
        stack.deleteElementFromStack();
        stack.deleteElementFromStack();
        stack.deleteElementFromStack();
        stack.deleteElementFromStack();



        try {
            stack.addElementToStack(5);
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            stack.addElementToStack(5);
        } catch (StackIsFullException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        System.out.println("Стек пуст? " + stack.isEmpty());

        try {
            stack.addElementToStack(35);
            stack.addElementToStack(75);
            stack.addElementToStack(205);
        } catch (StackIsFullException e) {
            System.out.println("Помилка при додаванні: " + e.getMessage());
        }
        try {
            System.out.println("Верхній елемент: " + stack.readTop());
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка при перегляді верхнього елементу: " + e.getMessage());
        }

        try {
            System.out.println("Дістали: " + stack.deleteElementFromStack());
            System.out.println("Дістали: " + stack.deleteElementFromStack());
            System.out.println("Дістали: " + stack.deleteElementFromStack());
            stack.addElementToStack(4);
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка при видаленні: " + e.getMessage());

        }
        System.out.println("Стек пуст? " + stack.isEmpty());


    }
}
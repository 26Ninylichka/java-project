package lesson28_inheritance;

public class Main {
    static void main() {

        Shape circle = new Circle(5);
        circle.displayInfo();
        System.out.println();

        Shape rectangle = new Rectangle(5, 5);
        rectangle.displayInfo();
        System.out.println();

        Shape square = new Square(4, 4, 4);
        square.displayInfo();
    }
}

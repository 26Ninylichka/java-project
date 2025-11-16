package lesson28_inheritance;

public abstract class Shape {

    abstract double calculateArea();

    abstract double calculatePerimeter();

    void displayInfo() {
        System.out.println("Це обстрактна фігура");
        System.out.println("Площа " + calculateArea());
        System.out.println("Периметр " + calculatePerimeter());
    }


}

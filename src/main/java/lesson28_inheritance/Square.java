package lesson28_inheritance;

public class Square extends Rectangle {
    private double side;


    public Square(double width, double height, double side) {
        super(width, height);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return super.calculateArea();
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}

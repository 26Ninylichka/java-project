package lesson28_inheritance;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
    @Override
    double calculatePerimeter() {
        return 4 * (width + height);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}

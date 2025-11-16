package lesson28_inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void schouldDoSquareArea() {
        // given
        Shape shape = new Square(4, 4,4);
        // when

        shape.calculateArea();
        shape.calculatePerimeter();
        // then
        Assertions.assertEquals(5, 5, shape.calculateArea());
        Assertions.assertEquals(5, 5,  shape.calculatePerimeter());
    }

}
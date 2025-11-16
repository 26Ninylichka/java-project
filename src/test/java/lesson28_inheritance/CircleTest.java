package lesson28_inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
    void schouldDoCircleArea() {
        // given
        Shape shape = new Circle(5);
        // when
        shape.calculateArea();
        shape.calculatePerimeter();
        // then

        Assertions.assertEquals(5, 15, shape.calculateArea());
        Assertions.assertEquals(5, 6, shape.calculatePerimeter());
    }

}
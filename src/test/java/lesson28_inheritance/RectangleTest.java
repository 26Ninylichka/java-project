package lesson28_inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void schoulDoRectangleArea() {
        // given
        Shape shape = new Rectangle(5, 5);
        // when

        shape.calculateArea();
        shape.calculatePerimeter();
        // then
        Assertions.assertEquals(25, shape.calculateArea());
        Assertions.assertEquals(40, shape.calculatePerimeter());
    }



}
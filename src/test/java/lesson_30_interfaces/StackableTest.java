package lesson_30_interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackableTest {
 @Test
    void shouldDoWhenStackIsEmpty() {
     // given
     Stackable stack = new Stack(5);
     // when
     boolean isEmpty = stack.isEmpty();
     // then
     Assertions.assertEquals(5, 5, "Стек пустий!");
 }

}
package lesson_30_interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class StackableTest {
 @Test
    void shouldDoWhenStackIsEmpty() {
     // given
     Stackable stack = new Stack(5);
     // when
     boolean isEmpty = stack.isEmpty();
     // then
     Assertions.assertTrue(isEmpty);
 }


 @Test
 void shouldThrowAnExceptionWhenStackIsEmpty() {
     //given
     Stackable stack = new Stack(1);
     // when + then
     Assertions.assertThrows(StackIsEmptyException.class,
             () -> stack.readTop());
 }

 @Test
    void shouldWhenReadTopIsOptional() {
     // given
     Stackable stack = new Stack(1);
     // when
     Optional<Integer> readTopOptional = stack.readTopOptional();

     // then
     Assertions.assertTrue(readTopOptional.isEmpty());
 }
}
package lesson_34_collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberUtilsTest {

    @Test
    void shouldDoWhenTheListIsEmpty() {
        // given
        List<Integer> numbers = new ArrayList<>();
        // when
        long result = NumberUtils.getSum(numbers);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldTheSumOfNegativeNumbers() {
        // given
        //List<Integer> numbers1 = Arrays.asList(-1, -2);// ми таке ще не проходили але спробувала бо по іншому не виходить
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(-1);
        numbers1.add(-2);

        // when
        long result = NumberUtils.getSum(numbers1);

        // then
        assertEquals(-3, result);
    }

    @Test
    void shouldWhenMultiplyOddNumbers() {
        // given
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        // when
        List<Integer> result1 = NumberUtils.multiplyOddNumber(numbers1);

        // then
        Assertions.assertEquals(List.of(2, 6), result1);
    }
}
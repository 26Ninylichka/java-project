package lesson_20_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CarTest {


    @Test
    void shouldBeAbleToCanDrive() {
        // given
        Car audiQ8 = new Car(60, 6, LocalDate.of(2026, 10, 2));

        // when
        boolean result = audiQ8.canDrive();

        // then
        Assertions.assertTrue(result);
    }


    @Test
    void shouldBeIsAllowedToDriveWhenTuvIsOk() {
        //given
        Car audiQ7 = new Car(60, 6, LocalDate.of(2025, 11, 4));

        //when
        boolean result = audiQ7.isAllowedToDrive();

        //then
        Assertions.assertTrue(result);
    }


    @Test
    void shouldCalculateMaxDistanceCorrectly() {
        // given
        Car car = new Car(60, 6, LocalDate.of(2025, 11, 4));

        // when
        double result = car.maxDistance();

        // then
        Assertions.assertEquals(10, result, 0.001);
    }
}
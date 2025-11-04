package lesson_20_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @Test
    void shouldCanDrive() {
        // given
        Car audiQ8 = new Car(60, 6, LocalDate.of(2026, 10, 2));

        // when
        boolean result = audiQ8.canDrive();

        // then
        Assertions.assertTrue(result);
    }


    @Test
    void shouldIsAllowedToDriveReleaseDataIsInFuture() {
        //given
        Car audiQ8Future = new Car(60, 6, LocalDate.of(2026, 11, 4));

        // when
        boolean result = audiQ8Future.isAllowedToDrive();

        // then
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
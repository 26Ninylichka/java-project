package lesson_40_comporator_comparable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldSortCarByYear() {
        // given
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2022, 3.0));
        cars.add(new Car(2024, 3.0));
        cars.add(new Car(2021, 2.0));
        // when
        cars.sort(Comparator.comparing(Car::getYearOfManufacture));

        // then
        Assertions.assertEquals(2021, cars.get(0).getYearOfManufacture());
        Assertions.assertEquals(2022, cars.get(1).getYearOfManufacture());
        Assertions.assertEquals(2024, cars.get(2).getYearOfManufacture());

    }

    @Test
    void shouldSortCarsInTreeSetByEngineCapacity() {

        // given
        TreeSet<Car> cars1 = new TreeSet<>(Comparator.comparing(Car::getEngineCapacity));
        cars1.add(new Car(2023, 2.0));
        cars1.add(new Car(2025, 3.0));
        cars1.add(new Car(2025, 4.0));

        // when
        Car first = cars1.first();
        Car last = cars1.last();
        // then
        Assertions.assertEquals(2.0, first.getEngineCapacity());
        Assertions.assertEquals(4.0, last.getEngineCapacity());
    }
}
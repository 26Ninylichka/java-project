package lesson_40_comporator_comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    static void main() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2023, 2.0));
        cars.add(new Car(2025, 2.8));
        cars.add(new Car(2022, 3.0));

        cars.sort(Comparator.comparing(Car::getYearOfManufacture));
        System.out.println("Сортуємо за роком випуску");
        for (Car audi : cars) {
            System.out.println(audi);
        }
        TreeSet<Car> cars1 = new TreeSet<>(Comparator.comparing(Car::getEngineCapacity));
        cars1.add(new Car(2023, 2.0));
        cars1.add(new Car(2025, 2.8));
        cars1.add(new Car(2022, 3.0));
        System.out.println("Відсортовано за об'ємом двигуна: ");
        for (Car bmw : cars1) {
            System.out.println(bmw);

        }

    }
}

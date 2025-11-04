package lesson_20_lombok;

import java.time.LocalDate;

public class Main {
    static void main() {
        Car audiQ8 = new Car(60, 6, LocalDate.of(2026, 10, 2));
        System.out.println("Машина може їхати: " + audiQ8.canDrive());
        System.out.println("Машина допущена до експлуатації: " + audiQ8.isAllowedToDrive());
        System.out.println("Максимальна дистанція: " + audiQ8.maxDistance() + " км");
    }
}

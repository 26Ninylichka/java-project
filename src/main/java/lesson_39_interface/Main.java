package lesson_39_interface;

import java.util.function.*;

public class Main {
    static void main() {

        Predicate<Integer> isNegative = number -> number < 0;

        System.out.println(isNegative.test(-5));
        System.out.println(isNegative.test(6));

        Consumer<Cat> printCat = cat ->
                System.out.println("Кіт: " + cat.name);
        printCat.accept(new Cat("Danny"));


        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100);
        System.out.println(randomNumber.get());

        Supplier<Integer> throwsNullPointExceptions = () -> {
            throw new NullPointerException("Помилка");

        };


        Function<Integer, String> intToString = number -> String.valueOf(number);


        Function<Cat, Raccoon> catToRaccoon = cat -> new Raccoon(cat.name + "Це Єнот");
        System.out.println(catToRaccoon.apply(new Cat("Manny")));

        UnaryOperator<Double> sqrt = number -> Math.sqrt(number);
        System.out.println(sqrt.apply(6.0));

        UnaryOperator<Integer> factorial = number -> {
                int r = 1;
        for (int i = 1; i <= number; i++) {
            r *= i;

        }
        return r;


            };
        System.out.println(factorial.apply(7));

    }
}

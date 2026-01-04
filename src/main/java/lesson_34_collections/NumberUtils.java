package lesson_34_collections;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    //  getSum(List numbers) - Порахувати суму чисел
    // for(на стероідах)number:numbers

    public static long getSum(List<Integer> numbers) {
        long sum = 0;

        for (int number : numbers) {
            sum = sum + number;


        }

        System.out.print("Сумма чисел ");

        return sum;


    }
    //Реалізувати multiplyOddNumber(List numbers) -
    // знаходить непарні числа і множить на 2 і повертає список помножених чисел.
    // Приклад : 1, 2, 3 -> 2, 6

    public static List<Integer> multiplyOddNumber(List<Integer> numbers1) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers1.size(); i++) {
            int num = numbers1.get(i);
            if (num % 2 != 0) {

                int doubled = num * 2;
                result.add(doubled);
            }

        }
        return result;
    }


}


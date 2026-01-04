package lesson_34_collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        long sum = NumberUtils.getSum(numbers);


        System.out.println(sum);

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        List<Integer> result = NumberUtils.multiplyOddNumber(numbers1);
        System.out.println(result);


    }
}

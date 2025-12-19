package lesson_41_stream;

import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {


            List<Student> students = List.of(
                    new Student("Nina", 19, 4.5),
                    new Student("Yevgen", 22, 3.8),
                    new Student("Oleh", 21, 5.0),
                    new Student("Nika", 23, 4.2),
                    new Student("Anton", 18, 3.5)
            );

            // 1. grade < 4.0
            students.stream()
                    .filter(s -> s.getGrade() < 4.0)
                    .forEach(s -> System.out.println(s.getName()));


            students.stream()
                    .max(Comparator.comparingDouble(Student::getGrade))
                    .ifPresent(s -> System.out.println("Best: " + s.getName()));


            long count = students.stream()
                    .filter(s -> s.getAge() > 20)
                    .count();
            System.out.println("Older than 20: " + count);


            students.stream()
                    .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                    .map(Student::getName)
                    .forEach(System.out::println);


            boolean hasFive = students.stream()
                    .anyMatch(s -> s.getGrade() == 5.0);
            System.out.println("Has 5.0: " + hasFive);


            students.stream()
                    .filter(s -> s.getGrade() > 4.0)
                    .map(Student::getName)
                    .forEach(System.out::println);
        }
    }
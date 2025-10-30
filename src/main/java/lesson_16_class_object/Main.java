package lesson_16_class_object;

import lesson_16_class_object.animals.Dragon;

import java.util.Scanner;

public class Main {
    static void main() {

        Dragon dragon1 = new Dragon();
        dragon1.setName("Ferry");
        dragon1.setAge(5);
        dragon1.setWeight(400.0);
        dragon1.setBreed(Breed.WERMAKS);


        System.out.println("Дракона звати: " + dragon1.getName());
        System.out.println("Вік Дракона: " + dragon1.getAge());
        System.out.println("Вага Дракона: " + dragon1.getWeight());
        System.out.println("Порода Дракона: " + dragon1.getBreed());

        Dragon mammy = new Dragon("Mammy", 25, 1000, Breed.ARRAKS);

        System.out.println("Дракона звати: " + mammy.getName());
        System.out.println("Вік Дракона: " + mammy.getAge());
        System.out.println("Вага Дракона: " + mammy.getWeight());


        Scanner scan = new Scanner(System.in);
        Dragon[] dragons = new Dragon[3];
        System.out.println("Створіть дракона");

        for (int i = 0; i < dragons.length; i++) {


            System.out.println("\nВведіть дані для дракона ");


            System.out.print("Введіть  імя дракона: ");
            String name = scan.nextLine();


            System.out.print("Введіть вік дракона: ");
            int age = scan.nextInt();

            System.out.println("Введіть вагу дракона");
            double weight = scan.nextDouble();

            scan.nextLine();
        }
        System.out.println("Ви створили всіх необхідних Драконів");

        mammy.voice();

        System.out.println(mammy.toString());

    }
}
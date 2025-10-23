package lesson13_scanner;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //Зчитати з клавіатури розмір масиву n. (n x m - для сміливих)

        System.out.println("Введіть розмір майбутнього масиву: ");
        int arrayLength = scanner.nextInt();
        //Створити масив цілих чисел і заповнити його даними користувача.
        int[] arr = new int[arrayLength];

        System.out.println("Введіть усі елементи масиву по черзі.Натискайте ");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }
        while (true) {
            //Вивести текстове меню
            System.out.println("Меню: Введіть цифру ");
            System.out.println("Введіть цифру 1 щоб Порахувати суму елементів");
            System.out.println("Введіть цифру 2 щоб Знайти середнє арифметичне всіх елементів");
            System.out.println("Введіть цифру 3 шоб Знайти найбільший елемент");
            System.out.println("Введіть цифру 4 шоб Завершити програму");

            System.out.println("Виберіть дію");
            int array1= scanner.nextInt();
            switch (array1) {
                case 1:// Порахувати суму елементів
                    int[] array2 = new int[arrayLength];
                    int sum = 0;
                    for (int i = 0; i < array2.length; i++) {
                        sum += array2[i];
                    }
                    System.out.println("Сумма елементів : " + sum);
                    break;
                case 2:// Знайти середнє арифметичне всіх елементів
                    int[] array3 = new int[arrayLength];
                    int sum1 = 0;
                    for (int number : array3) {
                        sum1 += number;
                    }
                    System.out.println("Середнє арифметичне всіх елементів: " + sum1);
                    break;
                case 3://Знайти найбільший елемент
                    int[] array4 = new int[arrayLength];
                    int max = array4[0];
                    for (int i = 1; i < array4.length; i++) {
                        if (array4[i] > max) {
                            max = array4[i];
                        }
                    }
                    System.out.println("Найбільший елемент: " + max);
                    break;
                case 4://Завершити програму

                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;
            }
        }


    }

}

package lesson11_switch;

public class Main {
    static void main() {
        int dayNumber = 4;
        String day = switch (dayNumber){
          case 1 -> "Понеділок";
          case 2 -> "Вівторок" ;
          case 3 -> "Середа";
          case 4 -> "Четверг";
          case 5 -> "П'ятниця";
          case 6 -> "Субота";
          case 7 -> "Неділя";
          default -> "Ненайдено";
        };
        System.out.println(day);

        //другий варіант

      int number = 7;
        switch (number) {
            case 1 -> System.out.println("Понеділок");
            case 2 -> System.out.println("Вівторок");
            case 3 -> System.out.println("Середа");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("П'ятниця");
            case 6 -> System.out.println("Субота");
            case 7 -> System.out.println("Неділя");
            default -> System.out.println("Ненайдено");
        }
    }
}

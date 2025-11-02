package lesson19_recursion;

public class MyMath {

    public static int numberFibonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return numberFibonachi(n - 1) + numberFibonachi(n - 2);

    }
}



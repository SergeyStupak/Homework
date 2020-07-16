/**
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class Met10 {
    public static void main(String[] args) {
        long Factorial = 1;
        int n = 1;
        int x = 1;
        do {
            Factorial *=n;
            n++;
            System.out.println("Факториал числа " + x + " равен " + Factorial);

        }
        while (x==10 & x<16);


    }
}

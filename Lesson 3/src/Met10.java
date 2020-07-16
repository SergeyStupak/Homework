/**
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class Met10 {
    public static void main(String[] args) {
        for (int i = 10; i < 16; i++) {
            long Factorial = 1;
            int n = 1;
            int x = i;
            while (x >= n) {
                Factorial *= n;
                n++;
            }
            System.out.println("Факториал числа " + x + " равен " + Factorial);
        }
    }
}
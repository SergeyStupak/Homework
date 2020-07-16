import java.util.Scanner;

/**
 * В переменную записываете количество программистов.
 * В зависимости от количества программистов необходимо вывести правильно окончание.
 * Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */
public class Task7 {
    public static void main(String[] args) {
        int programmers = 99;

        int x = programmers % 10;
        int y = programmers % 100;

        if (y >= 11 && y < 20) {
            System.out.println(programmers + " программистов");
        } else {
            switch (x) {
                case 1:
                    System.out.println(programmers + " программист");
                    break;
                case 2:
                    System.out.println(programmers + " программистa");
                    break;
                default:
                    System.out.println(programmers + " программистов");
                    break;
            }
        }
    }
}
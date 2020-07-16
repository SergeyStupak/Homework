import java.util.Scanner;

/**
 * Создайте число. Определите, является ли число трехзначным. Определите, является
 * ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class Met6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int Number = sc.nextInt();
        sc.close();
        if (Number >= 100 & Number < 1000) {
            System.out.println("Это трехначное число");
        } else {
            System.out.println("Это число не трехначное");
        }
        if (Number % 10 == 7) {
            System.out.println("Последняя цифра семерка");
        } else {
            System.out.println("Последняя цифра не семерка");
        }
        if (Number % 2 == 0) {
            System.out.println("Это число четное");
        } else {
            System.out.println("Это число не четное");
        }

    }
}




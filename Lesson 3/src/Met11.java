/**
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class Met11 {
    public static void main(String[] args) {
        int number = 228;
        for (int i = 2; i <= number; i++) {
            if (number % i == 1) {
                System.out.println(number +" являеться простым числом");
                return;
            } else {
                System.out.println(number +" не являеться простым числом");
                return;
            }
        }
    }
}

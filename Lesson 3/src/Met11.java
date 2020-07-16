/**
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class Met11 {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= number; i++) {
            int a = number%i;
            if (a<1)
            System.out.println(number + " является простым");
        }
    }
}
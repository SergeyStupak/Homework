import java.util.Random;

/**
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class Met11 {
    public static void main(String[] args) {
        int number = 6;
        int a = 1;
        for (int i = 1; i <= number; i++) {
        if (number/i ==1){
                System.out.println("является простым");
           }else{
                System.out.println("не является простым");
            }
        }
    }}
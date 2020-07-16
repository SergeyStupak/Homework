/**
 * Имеется целое число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.*
 */

import java.util.Random;

public class Met8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int $ = rand.nextInt();

        int b = $ % 10;
        int c = $ % 10;

        if (b == 1 || b == -1)
            System.out.println($ + " рубль");
        else if (c >= 2 & c <= 4 | c <= -2 & c >= -4)
            System.out.println($ + " рубля");
        else
            System.out.println($ + " рублей");

    }

}


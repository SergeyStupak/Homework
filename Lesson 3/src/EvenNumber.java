/**
 * Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */

public class EvenNumber {
    public static void main(String[] args) {
        int[] numbers = new int[102];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 10) + 2);

            for (int a = 2; a <= 100; a++) {
                if (a%2==0);
                System.out.println(a);
            }
        }
    }}


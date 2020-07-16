/**
 * Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
 */
public class OddNumber {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int r = 1; r < numbers.length; r++) {
                if (r % 2 >= 1)
                    sum += r;
            }
            System.out.println(sum);
            break;
        }
    }
}



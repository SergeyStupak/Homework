import java.net.BindException;
import java.util.Random;

/**
 * Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Met13 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 10) - 0);
            System.out.print(numbers[i] + ",");
        }
        for (int start = 0; start < numbers.length - 1; start++) {
            for (int index = 0; index < numbers.length - 1 - start; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int tmp = numbers[index];
                    numbers[index] = numbers[(index + 1)];
                    numbers[(index + 1)] = tmp;

                }
            }
        }
        System.out.println('\n' + "Наибольшим числом будет " + numbers[4]);
    }
}








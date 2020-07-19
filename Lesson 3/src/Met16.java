import java.util.Random;

/**
 * Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */
public class Met16 {
    public static void main(String[] args) {
        int array[] = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }

    }
}


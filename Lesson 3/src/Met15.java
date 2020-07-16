/**
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 */
public class Met15 {
    public static void main(String[] args) {
        int array[] = {5, 3, 9, 7, 8, 1, 6, 5, 8, 7, 3};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
            for (int start = 0; start < array.length - 1; start++) {
            for (int index = 0; index < array.length - 1 - start; index++){
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                array[index] = array[(index + 1)];
                array[(index + 1)] = tmp;
                System.out.print(array[tmp] + " ");


                }
            }
        }}}}




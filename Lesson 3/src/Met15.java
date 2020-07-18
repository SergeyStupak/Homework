/**
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 */
public class Met15 {
    public static void main(String[] args) {
        int array[] = {5, 3, 9, 7, 8, 1, 6, 5, 8, 7, 3};
        for (int start = 0; start < array.length; start++) {
            System.out.print(array[start] + "\t");
        }
        System.out.print("<==>" + "\t");
        for (int i = array.length - 1; i > -1; i--) {
            System.out.print(array[i] + "\t");
        }
    }
}








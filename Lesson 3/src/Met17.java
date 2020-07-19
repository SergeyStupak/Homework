/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
public class Met17 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

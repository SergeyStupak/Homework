import java.util.Scanner;

/**Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */
public class Met7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника");
        int Длина = sc.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int Ширина = sc.nextInt();
        System.out.println("Введите радиус круга");
        int Радиус = sc.nextInt();
sc.close();
        if (Радиус>Длина/2 & Радиус>Ширина/2) {
            System.out.println("Можно");
        }else {
            System.out.println("Нельзя");
        }

    }
}


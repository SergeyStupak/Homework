/**
 * Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class Ameba {
    public static void main(String[] args) {
        int h = 0;
        int Ameba = 1;
        while (h < 24) {
            Ameba *= 2;
            h += 3;
            System.out.println("Через " + h + " часов будет " + Ameba + " амебы");
        }
    }
}

/**
 * Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов.
 * 1 дюйм = 2,54 см
 */
public class Printer {
    public static void main(String[] args) {
        int[] inch = new int[21];
        for (int i = 1; i < inch.length; i++) {
            inch[i] = i;
            for (double a = 1; a < inch.length; a++) {
                double resault = inch[i] * 2.54;
                System.out.println(inch[i] + " inch " + " = " + resault);
                break;
            }
        }
    }
}






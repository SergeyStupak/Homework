/**
 * Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.
 */
public class Met14 {
    public static void main(String[] args) {
        int assessment[] = {4, 6, 5, 8, 9, 4, 2, 7, 6, 2, 5, 4, 3};
            for (int start = 0; start < assessment.length - 1; start++) {
                for (int index = 0; index < assessment.length - 1 - start; index++) {
                    if (assessment [index] > assessment [index + 1]) {
                        int tmp = assessment [index];
                        assessment [index] = assessment [(index + 1)];
                        assessment [(index + 1)] = tmp;
                    }
                }
            }
            System.out.println("Максимальная оценка "+assessment[assessment.length-1]+" и ее номер " + assessment.length);
            System.out.println("Минимальная оценка "+assessment[0]+" и ее номер " + 0);
        }
    }
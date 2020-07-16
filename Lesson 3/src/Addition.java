/**
 * Вычислить: 1+2+4+8+...+256
 */
public class Addition {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 1; i <= 256; i *= 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}

/**Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */
public class Task4 {
    public static void main (String[] args) {
        int a = -1;
        int b = 1;
        int c = 0;

        if (a>0 & b>0 & c>0) {
            System.out.println("3 положительных числа");
        }else if (a<=0 & b>=0 & c>=0 | a>=0 & b<=0 & c>=0 | a>=0 & b>=0 & c<=0 )
            System.out.println("2 положительных числа");
        else if (a<=0 & b<=0 & c>=0 | a>=0 & b<=0 & c>=0 | a>=0 & b<=0 & c<=0 ) {
            System.out.println("1 положительное число");
        }else if (a<0 & b<0 & c<0)
                System.out.println("Положительных чисел нет");
    }
}











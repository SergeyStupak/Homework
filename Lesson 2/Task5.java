/**Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */
public class Task5 {
    public static void main (String[] args){
        int a = -1;
        int b = -2;
        int c = 3;

        if (a>0 & b>0 & c>0) {
            System.out.println("Все числа положительные");
        }else if (a<=0 & b>=0 & c>=0 | a>=0 & b<=0 & c>=0 | a>=0 & b>=0 & c<=0 )
            System.out.println("2 положительных числа и одно отрицательное");
        else if (a<=0 & b<=0 & c>=0 | a>=0 & b<=0 & c>=0 | a>=0 & b<=0 & c<=0 ) {
            System.out.println("1 положительное число и 2 отрицательных");
        }else if (a<0 & b<0 & c<0)
            System.out.println("Все числа отрицательные");
    }
}



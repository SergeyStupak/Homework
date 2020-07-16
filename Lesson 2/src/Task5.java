/**
Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
*/
public class Task5 {
    public static void main (String[] args){
        int Num1 = 1;
        int Num2 = 1;
        int Num3 = 1;

        int n = 0; int m = 0;
        if (Num1 >= 0)
            n++;
        else
            m++;
        if (Num2 >= 0)
            n++;
        else
            m++;
        if (Num3 >= 0)
            n++;
        else
            m++;
        System.out.println(n + " положительных чисел");
        System.out.println(m + " отрицательных чисел");
    }
}
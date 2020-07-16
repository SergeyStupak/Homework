/**
Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
*/
public class Task4 {
    public static void main(String[] args) {
        int Num1 = -1;
        int Num2 = 1;
        int Num3 = 1;

        int n = 0;
        if (Num1 >= 0)
            n++;
        if (Num2 >= 0)
            n++;
        if (Num3 >= 0)
            n++;
            System.out.println(n + " положительных чисел");

        }
    }


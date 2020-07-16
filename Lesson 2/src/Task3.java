/**
Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
Вывести полученное число
*/
public class Task3 {
    public static void main(String[] args) {
        int Num = 0;

        if(Num>0) {
            System.out.println(Num + 1);
        }else if (Num<0) {
            System.out.println(Num - 2);
        }else if (Num==0){
            System.out.println(10);

        }

    }
}




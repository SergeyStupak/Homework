/**Дано целое число. Если оно является положительным, то прибавить к нему 1.
*Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
*Вывести полученное число
 */
public class Task3 {
    public static void main(String[] args) {
        int a = 0;

        if(a>0) {
            System.out.println(a + 1);
        }else if (a<0) {
            System.out.println(a - 2);
        }else if (a==0){
            System.out.println(10);

        }

    }
}




/**Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
 *
 */
public class Сomparison {
    public static void main (String[] args) {
        int x = 2331;
        int a,b,c,d,e;
        a=x/1000;
        b=x%1000/100;
        c=x%100/10;
        d=x%10/1;
        if (a!=b || a!=c || a!=d) {
            System.out.println("Верно");
        }else{
            System.out.println("Не верно");
        }
    }
}
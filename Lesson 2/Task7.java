/**В переменную записываете количество программистов.
 *  В зависимости от количества программистов необходимо вывести правильно окончание.
 *  Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */
public class Task7 {
    public static void main(String[] args) {
       int a = 22;

       int x = a % 10;
       int y = a % 100;
       if (a==1 | a>20) {
           System.out.println(a + " программист");
       } else if (a<=2 | a<=4  ) {
            System.out.println(a + " программистa");
       }else
            System.out.println(a + " программистов");
    }

}
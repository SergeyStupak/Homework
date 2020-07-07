/**В переменную записываете количество программистов.
 *  В зависимости от количества программистов необходимо вывести правильно окончание.
 *  Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */
public class Task7 {
    public static void main(String[] args) {
        int a = 5;


    switch (a){
        case 1:
            System.out.println(a+"программист");
            break;
        case 2:
            System.out.println(a+"программиста");
            break;
        case 3:
            System.out.println(a+"программистов");
            break;
        default:
    }

    }
}

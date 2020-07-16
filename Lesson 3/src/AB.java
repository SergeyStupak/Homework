import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

/**
 * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class AB {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите значение A");
//        int a = sc.nextInt();
//        System.out.println("Введите значение B");
//        int b = sc.nextInt();
//        sc.close();

        int a = 7;
        int b = 4;
        int resault = 0;
        for (int i = 0; i < b; i++) {
            resault += a;
        }
        System.out.println(resault);
    }
}








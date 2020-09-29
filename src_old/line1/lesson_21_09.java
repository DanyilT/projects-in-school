package line1;

import java.util.Scanner;

public class lesson_21_09 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите 2-значное число");
        int a = s.nextInt();
        int a1 = a/10;
        int a2 = a%10;
        System.out.print("Сумма чисел = ");
        System.out.println(a1+a2);
        System.out.print("Умножение чисел = ");
        System.out.println(a1*a2);
    }
}

package line2;

import java.util.Scanner;

public class lesson1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите 3-значное число");
        int a = s.nextInt();
        int a1 = a/100;
        int a2 = a/10%10;
        int a3 = a%10;
        System.out.print("Число в обратном порядке = ");
        System.out.println(a3*100 + a2*10 + a1);
    }
}

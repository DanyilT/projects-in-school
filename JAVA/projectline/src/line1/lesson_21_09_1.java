package line1;

import java.util.Scanner;

public class lesson_21_09_1 {
    static Scanner b = new Scanner(System. in);
    public static void main(String[] args) {
        System.out.println("Введите двухзначное число");
        int a = b.nextInt();
        int c = a/10;
        int d = a%10;
        System.out.println(c + d);
        System.out.println(c * d);
    }
}

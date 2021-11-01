package line2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lesson_1 {
    static Scanner c = new Scanner(System. in);
    public static void main(String[] args) {
        System.out.println("Введите трезхназночное число");
        int a = c.nextInt();
        int c = a/100;
        int b = a/10%10;
        int d = a%10;
        System.out.println(d*100+b*10+c);
    }
}

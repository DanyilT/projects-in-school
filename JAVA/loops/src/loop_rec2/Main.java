package loop_rec2;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static int recorsion(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + recorsion(n / 10);
    }
    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = s.nextInt();
        System.out.println(recorsion(a));
    }
}

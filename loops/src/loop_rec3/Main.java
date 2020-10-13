package loop_rec3;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static int recorsion(double n) {
        if (n == 1) {
            return 1;
        } else if (n > 1 && n < 2) {
            return 0;
        } else
            return recorsion(n / 2);
    }
    public static void main(String[] args) {
        System.out.println("Введите число");
        double a = s.nextInt();
        if (recorsion(a) == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
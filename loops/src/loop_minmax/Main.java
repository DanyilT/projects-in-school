package loop_minmax;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число");
        int max = 0;
        int min = 0;
        int x = 1;
        while (x <= 5){
            System.out.println("Введите " + x + " число");
            int a = s.nextInt();
            if (a > max) max = a;
            if (a > min) min = a;
            x++;
        }
        System.out.println("Максимальное число " + max + "; Минимальное число " + min);
    }
}

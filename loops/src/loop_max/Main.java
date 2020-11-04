package loop_max;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    private static int MAX_VALUE;
    public static void main(String[] args) {
        int max = MAX_VALUE;
        int x = 1;
        while (x <= 5){
            System.out.println("Введите " + x + " число");
            int a = s.nextInt();
            if (a >= max) max = a;
            x++;
        }
        System.out.println("Максимальное число " + max);
    }
}

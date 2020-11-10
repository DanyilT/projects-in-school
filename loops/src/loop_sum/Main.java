package loop_sum;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите " + (i+1) + " число");
            int x = s.nextInt();
            a+=x;
        }
        System.out.println("сумма 5 чисел равна " + a);
        double n =a/5;
        System.out.println("Среднее 5 чисел " + n);
    }
}
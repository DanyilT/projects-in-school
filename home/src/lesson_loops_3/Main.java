package lesson_loops_3;     //Задачі на цикли   //№5(Решение задач на циклы)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a =0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите " + (i+1) + " число");
            int x = s.nextInt();
            a+=x;
        }
        System.out.println("Сумма 10 чисел = " + a);
        double n =a/10;
        System.out.println("Среднее 10 чисел = " + n);
    }
}

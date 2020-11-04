package lesson_loops_4;     //Задачі на цикли   //№13(Решение задач на циклы)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("В області 8 районів");
        int a = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Вкажіть кількість пшениці зібраної в " + (i+1) + " районі");
            int x = s.nextInt();
            a+=x;
        }
        System.out.println("Кількість пшениці зібраної в області = " + a);
        System.out.println();
        int b = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Вкажіть середню врожайність пшениці в " + (i + 1) + " районі");
            int x = s.nextInt();
            b += x;
        }
            double n = b / 10;
            System.out.println("Середня врожайність пшениці в області = " + n);
    }
}

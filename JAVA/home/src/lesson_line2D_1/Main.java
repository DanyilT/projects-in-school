package lesson_line2D_1;    //line2D  //№10(Система Git. Ресурси github. Команди)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите 3-значное число");
        int a = s.nextInt();
        int a1 = a/100;
        int a2 = a/10%10;
        int a3 = a%10;
        System.out.println("Число едениц в нём = " + a3);
        System.out.println("Число десятков в нём = " + a2);
        System.out.println("Сумма его цифр = " + (a1+a2+a3));
        System.out.println("Произведение его цифр = " + (a1*a2*a3));
    }
}
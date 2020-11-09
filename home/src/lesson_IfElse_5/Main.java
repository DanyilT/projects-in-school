package lesson_IfElse_5;        //Задачи на тернарный оператор   //№3(Тернарний оператор. Вкладені оператори  if.)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число a ");
        int a =s.nextInt();
        System.out.println("Введите число b ");
        int b =s.nextInt();
        System.out.println("Введите число c ");
        int c =s.nextInt();
        boolean A = (a+b > c) ? true : false;
        boolean B = (a+c > b) ? true : false;
        boolean C = (b+c > a) ? true : false;
        System.out.println(A && B && C ? "Да, треугольник существует" : "Нет, триугольник несуществует");
    }
}

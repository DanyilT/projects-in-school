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
        boolean A = (a+b > c);
        boolean B = (a+c > b);
        boolean C = (b+c > a);
        if (A && B && C){
            System.out.println("Да, треугольник существует.");
        }else {
            System.out.println("Нет, триугольник несуществует");
        }
    }
}

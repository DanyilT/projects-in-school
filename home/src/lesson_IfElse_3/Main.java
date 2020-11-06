package lesson_IfElse_3;        //Задачи на тернарный оператор   //№1(Тернарний оператор. Вкладені оператори  if.)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);  //Две стороны должны быть равны
    public static void main(String[] args){
        System.out.println("Введите число a ");
        int a =s.nextInt();
        System.out.println("Введите число b ");
        int b =s.nextInt();
        System.out.println("Введите число c ");
        int c =s.nextInt();
        boolean t = (a == b) | (a == c) | (b == c);
        if (t){
            System.out.println("Треугольник равнобедренный");
        }else {
            System.out.println("Треугольник не равнобедренный");
        }
    }
}
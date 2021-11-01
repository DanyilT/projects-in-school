package lesson_IfElse_4;        //Задачи на тернарный оператор   //№2(Тернарний оператор. Вкладені оператори  if.)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите год");
        int n =s.nextInt();
        boolean t = (n % 100 == 0) ? ((n % 400 == 0) ? true : false) : ((n % 4 == 0) ? true : false);
        System.out.println(t ? "Год высокосный" : "Год не высокосный");
    }
}

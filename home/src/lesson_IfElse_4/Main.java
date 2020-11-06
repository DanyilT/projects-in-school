package lesson_IfElse_4;        //Задачи на тернарный оператор   //№2(Тернарний оператор. Вкладені оператори  if.)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите год");
        int n =s.nextInt();
        boolean b = (n % 100 == 0) & (n % 400 == 0) | (n % 4 == 0);
        if (b){
            System.out.println("Год высокосный");
        }else {
            System.out.println("Год не высокосный");
        }
    }
}

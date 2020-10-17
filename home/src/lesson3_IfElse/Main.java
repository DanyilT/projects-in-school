package lesson3_IfElse;    //задачи на ветвление  //№13(Операції порівняння. Формат  boolean.  Оператори if та if-else.)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите температуру тела человека");
        Double a = s.nextDouble();
        Boolean b = a > 36 & a < 37;
        if (b){
            System.out.println("Здоров");
        }else {
            System.out.println("Не здоров");
        }
    }
}
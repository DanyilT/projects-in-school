package lesson_IfElse_1;    //задачи на ветвление  //№5(Операції порівняння. Формат  boolean.  Оператори if та if-else.)

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите рост человека");
        int a = s.nextInt();
        Boolean b = a > 180;
        if (b){
            System.out.println("Высокий");
        }else {
            System.out.println("Не очень высокий");
        }
    }
}
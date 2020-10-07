package lesson8;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите целое число");  //буз сохранения переменной
        int a = s.nextInt();
        System.out.println(a%2==0 ? "Чётное" : "Нечётное");

        System.out.println("Введите целое число");  //с сохранением переменной
        int b = s.nextInt();
        String s = b%2==0 ? "Чётное" : "Нечётное";
        System.out.println(s);
    }
}
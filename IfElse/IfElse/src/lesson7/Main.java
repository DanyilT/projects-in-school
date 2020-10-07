package lesson7;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите a");
        int a = s.nextInt();
        Boolean b = (a % 2 == 0) | (a % 3 == 0);    //a
        System.out.println("Целое А кратно двум или трём" + b);
    }
}
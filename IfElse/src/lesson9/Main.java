package lesson9;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите цифру");
        int a = s.nextInt();
        String n;
        switch (a) {
            case 0:
                n = "zero";
                break;
            case 1:
                n = "one";
                break;
            case 2:
                n = "two";
                break;
            case 3:
                n = "three";
                break;
            case 4:
                n = "four";
                break;
            case 5:
                n = "five";
                break;
            case 6:
                n = "six";
                break;
            case 7:
                n = "seven";
                break;
            case 8:
                n = "eight";
                break;
            case 9:
                n = "nine";
                break;
            default:
                n = "Ошибка ввода";
        }
        System.out.println(n);
    }
}

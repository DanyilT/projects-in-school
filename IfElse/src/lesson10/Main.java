package lesson10;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер дня недели");
        int a = s.nextInt();
        String n;
        switch (a) {
            case 1:
                n = "Monday";
                break;
            case 2:
                n = "Tuesday";
                break;
            case 3:
                n = "Wednesday";
                break;
            case 4:
                n = "Thursday";
                break;
            case 5:
                n = "Friday";
                break;
            case 6:
                n = "Saturday";
                break;
            case 7:
                n = "Sunday";
                break;
            default:
                n = "Ошибка ввода";
        }
        System.out.println(n);
    }
}

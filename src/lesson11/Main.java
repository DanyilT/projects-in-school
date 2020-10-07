package lesson11;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        int a = s.nextInt();
        String n;
        switch (a) {
            case 1:
                n = "January = 31 days";
                break;
            case 2:
                n = "February = 29 days";
                break;
            case 3:
                n = "March = 31 days";
                break;
            case 4:
                n = "April = 30 days";
                break;
            case 5:
                n = "May = 31 days";
                break;
            case 6:
                n = "June = 30 days";
                break;
            case 7:
                n = "July = 31 days";
                break;
            case 8:
                n = "August = 31 days";
                break;
            case 9:
                n = "September = 30 days";
                break;
            case 10:
                n = "October = 31 days";
                break;
            case 11:
                n = "November = 30 days";
                break;
            case 12:
                n = "December = 31 days";
                break;
            default:
                n = "Ошибка ввода";
        }
        System.out.println(n);
    }
}

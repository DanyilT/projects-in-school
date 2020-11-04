package lesson12;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите координаты");
        int x1 = 2;
        int y1 = 6;
        int x2 = 6;
        int y2 = 4;
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);
        System.out.print("x3 = ");
        int x3 = s.nextInt();
        System.out.print("y3 = ");
        int y3 = s.nextInt();
        System.out.print("x4 = ");
        int x4 = s.nextInt();
        System.out.print("y4 = ");
        int y4 = s.nextInt();

        Boolean a1 = x3 <= x1 & x4 >= x2 & y3 >= y1 & y4 <= y2;
        if (a1) {
            System.out.println("Пересекается");
        } else {
            System.out.println("Не пересекается");
            Boolean a2 = x1 == x3 | x2 == x4;

            if (a2) {
                System.out.println(" Пересекается");
            } else {
                System.out.println(" Не пересекается");

                Boolean a3 = y1 == y3 | y2 == y4;
                if (a3) {
                    System.out.println("  Пересекается");
                } else {
                    System.out.println("  Не пересекается");

                    Boolean a4 = x1 == x3 | x1 == x4 | x2 == x3 | x2 == x4 | y1 == y3 | y1 == y4 | y2 == y3 | y2 == y4;
                    if (a4) {
                        System.out.println("   Пересекается");
                    } else {
                        System.out.println("   Не пересекается");
                    }
                }
            }
        }
    }
}
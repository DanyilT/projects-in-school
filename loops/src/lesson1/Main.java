package lesson1;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
//Вывод таблицы умножения через While
        System.out.println("Ведите параметр таблицы уможения");
        int a1 = s.nextInt();
        int n1 = 1;
        while (n1 <= 10) {
            System.out.println(a1 + "*" + n1 + "=" + a1 * n1);
            n1++;
        }
//Вывод таблицы умножения через Do
        System.out.println("Ведите параметр таблицы уможения");
        int a2 = s.nextInt();
        int n2 = 1;
        do {
            System.out.println(a2 + "*" + n2 + "=" + a2 * n2);
            n2++;
        } while (n2 <= 10);
//Вывод таблицы умножения через For
        System.out.println("Ведите параметр таблицы уможения");
        int a3 = s.nextInt();
        for (int n3 = 1; n3<=10; n3++){
            System.out.println(a3 + "*" + n3 + "=" + a3 * n3);
        }
    }
}

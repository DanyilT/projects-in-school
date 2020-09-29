package lesson6;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите x и y");
        int x = s.nextInt();
        int y = s.nextInt();
        Boolean a = x*x + y*y <= 4;     //а
        Boolean b = (x <= 0) | (y*y != 0);    //в
        Boolean d = (!(x*y != 0)) & (y > x);    //д
        System.out.println(a + " " + b + " " + d);
    }
}
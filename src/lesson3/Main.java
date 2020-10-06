package lesson3;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите 3 чила");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int D = b*b-4*a*c;
        Boolean d = D<0;
        if(d){
            System.out.println("Нет корней");
        }else{
            System.out.println("Корни есть");
            double x1 = (-D - sqrt(D))/(2*a);
            double x2 = (-D - sqrt(D))/(2*a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
}

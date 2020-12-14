package package1.pack1;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        //sum
        System.out.print("Введите первый член арефметической прогресии ");
        int a1 = s.nextInt();
        System.out.print("Введите разность арефмитической прогресии ");
        int d1 = s.nextInt();
        System.out.print("Введите сумму какого количества членов требуется найти ");
        int n1 = s.nextInt();
        Sum s = new Sum(a1, d1);
        double sum = s.sum(a1, d1, n1);
        System.out.println("Суььа " + n1 + " членов арефметической прогресии = " + sum);
        //n
        System.out.print("Введите первый член арефметической прогресии ");
        int n2 = s.nextDouble();
        System.out.print("Введите разность арефмитической прогресии ");
        int d2 = s.nextInt();
        N n = new N(n1, d2);
    }
}

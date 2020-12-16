package package1.pack1;

import java.util.Scanner;

public class Main {
    static Scanner ss = new Scanner(System.in);
    public static void main(String[] args) {
        //sum
        System.out.print("Введите первый член арефметической прогресии ");
        double a1 = ss.nextDouble();
        System.out.print("Введите разность арефмитической прогресии ");
        double d1 = ss.nextDouble();
        System.out.print("Введите сумму какого количества членов требуется найти ");
        double n1 = ss.nextDouble();
        Sum_2 s = new Sum_2(a1, d1);
        double sum = s.sum(a1, d1, n1);
        System.out.println("Сума " + n1 + " членов арефметической прогресии = " + sum);
        //n
        System.out.print("Введите первый член арефметической прогресии ");
        double a2 = ss.nextDouble();
        System.out.print("Введите разность арефмитической прогресии ");
        double d2 = ss.nextDouble();
        System.out.print("Введите индекс искомого элемента:");
        double n2 = ss.nextDouble();
        N_3 n = new N_3(a2, d2);
        double i = 12;
        double N = n.i1(i);
        System.out.println("Суььа " + n2 + " членов арефметической прогресии = " + sum);

    }
}

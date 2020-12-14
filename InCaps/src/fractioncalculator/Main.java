package fractioncalculator;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите числитель и знаменатель первой доби: ");
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        System.out.print("Введите числитель и знаменатель второй доби: ");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        //sum
        Fraction f1 = new Fraction(x1, y1);
        Fraction f2 = new Fraction(x2, y2);
        Fraction sum = Calculator.add(f1, f2);
        System.out.print("Сумма данных дробей = ");
        View.display(sum);
        //dif
        Fraction f3 = new Fraction(x1, y1);
        Fraction f4 = new Fraction(x2, y2);
        Fraction dif = Calculator.dif(f1, f2);
        System.out.print("Разница данных дробей = ");
        View.display(dif);
        //mul
        Fraction f5 = new Fraction(x1, y1);
        Fraction f6 = new Fraction(x2, y2);
        Fraction mul = Calculator.mul(f1, f2);
        System.out.print("Произведение данных дробей = ");
        View.display(mul);
        //div
        Fraction f7 = new Fraction(x1, y1);
        Fraction f8 = new Fraction(x2, y2);
        Fraction div = Calculator.div(f1, f2);
        System.out.print("Деление данных дробей = ");
        View.display(div);
    }
}

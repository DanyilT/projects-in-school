package fractioncalculator;

public class Calculator {
    static Fraction add(Fraction f1, Fraction f2){
        Fraction sum = new Fraction();
        sum.denominator = f1.denominator * f2.denominator;
        sum.numerator = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        return sum;
    }
    static Fraction dif(Fraction f1, Fraction f2){
        Fraction dif = new Fraction();
        dif.denominator = f1.denominator * f2.denominator;
        dif.numerator = f1.numerator * f2.denominator - f1.denominator * f2.numerator;
        return dif;
    }
    static Fraction mul(Fraction f1, Fraction f2){
        Fraction mul = new Fraction();
        mul.denominator = f1.denominator * f2.denominator;
        mul.numerator = f1.numerator * f2.numerator;
        return mul;
    }
    static Fraction div(Fraction f1, Fraction f2){
        Fraction div = new Fraction();
        div.denominator = f1.denominator * f2.numerator;
        div.numerator = f1.numerator * f2.denominator;
        return div;
    }
}

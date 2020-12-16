package package1.pack1;

public class X_4 {
    double a = 2;
    double b = 3;
    double x;
    public X_4(double x4) {
        x = x4;
    }
    double i() {
        if (x > 2) return 3 * a * x;
        else return Math.pow(b, 2) - a / x;
    }
}

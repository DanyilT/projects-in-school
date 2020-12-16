package package1.pack1;

public class N_3 {
    double n2;
    double d2;
    N_3(double a, double b){
        n2 = a;
        d2 = b;
    }
    double i1(double i) {
        return n2 + (i - 1) *d2;
    }
    double i2(double i) {
        return (n2+i1(i))/2*i;
    }
}

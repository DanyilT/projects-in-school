package package1.pack1;

public class N {
    double n2;
    double d2;
    N(double a, double b){
        n2 = a;
        d2 = b;
    }
    double n(int i){
        double n = n2+(i-1);
        return n;
    }
}

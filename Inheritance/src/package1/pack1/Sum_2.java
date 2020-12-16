package package1.pack1;

public class Sum_2 {
    double a1;
    double d1;
    static double n1;
    Sum_2(double a, double b){
        a1= a;
        d1 = b;
    }
    double sum(double a, double d, double n){
        return (2*(double)a + d*(n-1))/2*n;
    }
}

package package1.pack1;

public class Sum {
    int a1;
    int d1;
    static int n1;
    Sum(int a, int b){
        a1= a;
        d1 = b;
    }
    double sum(int a, int b, int n){
        double s = (2*(double)a + d1*(n-1))/2*n1;
        return s;
    }
}

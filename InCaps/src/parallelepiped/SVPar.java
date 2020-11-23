package parallelepiped;

public class SVPar {
    int Square (int a, int b, int c){
        int spar = (a*b + a*c + b*c)*2;
        return spar;
    }
    int Volume (int a, int b, int c){
        int vpar = a*b*c;
        return vpar;
    }
}

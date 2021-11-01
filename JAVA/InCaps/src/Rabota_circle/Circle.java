package Rabota_circle;

public class Circle {
    //Координаты центра
    double x;
    double y;
    //Радиус
    double r;
    //Пи
    double p = 3.14;
    void printCircle(){
        System.out.println("(" + x + "; " + y + "); r = " + r);
    }
    void moveCircle(double a, double b){
        x = x + a;
        y = y + b;
    }
    void zoomCircle(double k){
        r = r * k;
    }
    double squareCircle(){
        double s = p * r * r;
        return s;
    }
    double lengthCircle(){
        double l = 2 * p * r;
        return l;
    }
}

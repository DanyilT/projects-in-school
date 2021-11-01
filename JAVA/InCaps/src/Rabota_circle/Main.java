package Rabota_circle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Центр окружности = (x; y); Радиус = r; Площадь = s; Длина окружности = l");
        Circle c = new Circle();
        c.x = 3;
        c.y = 6;
        c.r = 13.4;
        c.printCircle();
        c.moveCircle(2, 3);
        c.zoomCircle(4.6);
        c.printCircle();
        System.out.println("s = " + c.squareCircle() + "; l = " + c.lengthCircle());
    }
}

package rectangle;

public class Main {
    public static void main(String[] args) {
        Model x = new Model();
        x.a = 13;
        x.b = 98;
        Controller sp = new Controller();
        int s = sp.Square(x.a, x.b);
        int p = sp.Perimeter(x.a, x.b);
        rectangle.View view = new View();
        view.printSP(s, p);
    }
}
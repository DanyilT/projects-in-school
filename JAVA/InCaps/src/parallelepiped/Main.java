package parallelepiped;

public class Main {
    public static void main(String[] args) {
        Par a = new Par();
        a.a = 56;
        a.b = 34;
        a.c = 12;
        SVPar sv = new SVPar();
        int s = sv.Square(a.a, a.b, a.c);
        int v = sv.Volume(a.a, a.b, a.c);
        View view = new View();
        view.printS(s);
        view.printV(v);
        view.printSV(s, v);
    }
}

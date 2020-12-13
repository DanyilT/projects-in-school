package uml.package_rectangle;

public class Main extends rectangle{
    public static void main(String[] args) {
        rectangle r = new rectangle();
        int s = r.a*r.b;
        int p = 2*r.a+2*r.b;
        System.out.println("S = " + s + "; P = " + p);
    }
}

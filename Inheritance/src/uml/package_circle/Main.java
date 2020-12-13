package uml.package_circle;

public class Main extends circle{
    public static void main(String[] args) {
        circle c = new circle();
        double s = c.pi*c.r*c.r;
        double o = 2*c.pi*c.r;
        System.out.println("S = " + s + "; O = " + o);
    }
}

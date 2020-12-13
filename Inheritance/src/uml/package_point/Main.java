package uml.package_point;

public class Main extends point{
    public static void main(String[] args) {
        point p = new point();
        double AB = Math.sqrt((p.Bx-p.Ax)*(p.Bx-p.Ax)+(p.By-p.Ay)*(p.By-p.Ay));
        System.out.println("AB = " + AB);
    }
}

package overriding;

public class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        Swallow s = new Swallow();
        Penguin p = new Penguin();
        b.move();
        s.move();
        p.move();
    }
}

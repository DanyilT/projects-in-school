package finals;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        x++;
        System.out.println(x);
        Human h1 = new Human(16);
        Human h2 = new Human(24);
        final Human dany = new Human(8);
        //dany.birthday = 16;
        int f = fabrica(99);
        f++;
        System.out.println(f);
    }
    static int fabrica(int renge){
        return (int)(Math.random()*renge);
    }
}
class Human{
    static final String NAME = "Danyil";
    String address;
    int weight;
    final int birthday;
    Human(int birthday){
        this.birthday = birthday;
    }
}

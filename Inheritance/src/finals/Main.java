package finals;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        x++;
        System.out.println(x);
        Human h1 = new Human("Artem/Fox", "Kyiv/Forest", 60, 16);
        Human h2 = new Human("Danyil", "Kyiv", 60, 16);
        final Human dany = new Human("Misha", "Varhadskiy", 50, 16);
        Human [] AllBody = {h1, h2, dany};
        for (Human temp : AllBody) {
            System.out.println(temp);
        }
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

    public Human(String NAME, String address, int weight, int birthday) {
        this.address = address;
        this.weight = weight;
        this.birthday = birthday;
    }
}

package finals;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        x++;
        System.out.println(x);
        Human h1 = new Human("Forest", 60, 16);
        Human h2 = new Human("Kyiv", 30, 14);
        final Human dany = new Human("Varhadskiy", 50, 21);
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

    public Human(String address, int weight, int birthday) {
        this.address = address;
        this.weight = weight;
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "name = " + NAME + ", address = " + address  + ", weight = " + weight + ", birthday = " + birthday;
    }
}

package inheritance_polya;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "NoName";
        d.age = 8;
        d.brade = "Husky";
        d.width = 12;
        System.out.println(d.brade + " brade, " + d.age + " age, name - " + d.name + " " + d.width + " width");
    }
}

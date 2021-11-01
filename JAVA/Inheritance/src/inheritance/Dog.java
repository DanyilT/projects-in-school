package inheritance;

public class Dog extends Mammal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(m instanceof Mammal);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Mammal);
    }
}

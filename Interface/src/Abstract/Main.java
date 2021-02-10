package Abstract;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal() не возможно
        Animal cat = new Cat();
        cat.say();
        Animal dog = new Dog();
        dog.say();
    }
}

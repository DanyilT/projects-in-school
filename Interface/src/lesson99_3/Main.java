package lesson99_3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.process();

        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Animal[] animals = {animal1, animal2, cat1};
        Pet[] pets = {pet1, pet2, cat2.WhoAreYou()};

        for(Animal temp : animals){
            temp.process();
        }
        for(Pet temp : pets){
            temp.process();
        }
    }
}

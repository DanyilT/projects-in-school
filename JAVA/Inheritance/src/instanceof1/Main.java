package instanceof1;

public class Main {
    public static void main(String[] args) {
        int x = 50;
        double y = 1.5;
        double z = x;
        int c = (int)y;
        System.out.println(c + " " + y);
        double q = 99999999999.9;
        int b = (int)q;
        System.out.println(b);

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal1_dog = new Dog();
        Animal animal1_cat = new Cat();
        animal = dog;
        //dog = animal; error
        dog = (Dog)animal;
        //dog = animal1_cat; error
        //dog = (Dog)animal1_cat; error
        boolean p = dog instanceof Dog;
        System.out.println(p);
        if (dog instanceof Animal){
            animal = dog;
            System.out.println("1) animal = dog");
        }
        if (animal1_cat instanceof Dog){
            dog = (Dog)animal1_cat;
        }else {
            System.out.println("2) error");
        }
        boolean u = cat instanceof Cat;
        System.out.println(u);
        if (u){
            System.out.println("3) animal = cat");
            animal = cat;
        }else {
            System.out.println("3) egt" +
                    "rror");
        }
    }
}

package super2;

import super1.A;

public class Dog extends Animal {
    int price;
    String name;

    public Dog(int weight, String breed, int price, String name) {
        //super.weight = weight;
        //super.breed = breed;
        super(weight, breed);
        this.price = price;
        this.name = name;
    }
}

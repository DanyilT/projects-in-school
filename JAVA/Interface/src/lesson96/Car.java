package lesson96;

import java.util.Comparator;

public class Car {
    int speed, price;
    String color, model;

    public Car(int speed, int price, String color, String model) {
        this.speed = speed;
        this.price = price;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return"Car: " + "speed = " + speed + ", price = " + price + ", color = " + color + ", model = " + model;
    }
    static public class ComparatorByColor implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2){
            return o1.color.compareTo(o2.color);
        }
    }
}

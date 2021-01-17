package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayInfo();

        Car a =  new Car("Suzuki", 127, true);
        a.displayInfo();

        Car b = new Car("Ford", 9, true);
        b.displayInfo();
        Car c = new Car(110);
        c.displayInfo();
    }
}

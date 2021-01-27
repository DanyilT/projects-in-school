package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);

        Car a =  new Car("Suzuki", 127, true);
        System.out.println(a);

        Car b = new Car("Ford", 9, true);
        System.out.println(b);

        Car c = new Car(110);
        System.out.println(c);
    }
}

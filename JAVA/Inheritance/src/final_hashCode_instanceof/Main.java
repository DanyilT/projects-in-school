package final_hashCode_instanceof;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport("jeep",50);
        Car car = new Car("jeep",39, 5,"BMW");
        Bus bus = new Bus("minibus",60,8,"Mercedes-Benz",100000);
        System.out.println(transport);
        System.out.println(car);
        System.out.println(bus);
        System.out.println(car instanceof Transport);
        System.out.println(bus instanceof Object);
        System.out.println(transport.equals(car));
        System.out.println(transport.equals(bus));
    }
}

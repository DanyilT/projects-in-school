package polimorphism_CovariantReturns;

public class Main {
    public static void main(String[] args) {
        Transport transport1 = Transport.x("a", 3);
        Car car = (Car) Car.x(2, "tesla"); //Car возвращает Transport, кастим в Car
        Bus bus = Bus.x(3, "Mercedes-benz", 30000); //Bus возвращает себя же
        Transport transport2 = Bus.x(4, "BMW", 40000); //Down-casting при создании
        Transport[] transports = {transport1, car, bus, transport2};
        for (Transport t : transports) {
            //<класс>: type = <type>, size = <size>[, <имя>]
            System.out.printf("%-9s: type = %2s, size = %2d", t.getClass().getSimpleName(), t.getType(), t.getSize());
            if (t instanceof Car) {
                System.out.printf(", model = %-10s", ((Car) t).model);
            } else if (t instanceof Bus) {
                System.out.printf(", model = %-10s, price = %-10s", ((Bus) t).model, ((Bus) t).price);
            }
            System.out.println();
        }
    }
}
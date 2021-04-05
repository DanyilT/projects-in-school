package serialization1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //запись
        File file = new File("src/serialization1/file");
        Car car = new Car(5000, "BMW", new Engine(1500, "Human"), new Mashine(100));
        car.mashine.weight = 120;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(car);
        oos.flush();
        oos.close();
        //чтение
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Car newCar = (Car) ois.readObject();
        ois.close();
        System.out.println(newCar.price + " " + newCar.model + " " + newCar.engine.power + " " + newCar.mashine.weight);
    }
}

package serialization1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car extends Mashine implements Serializable {
    int price;
    String model;
    transient Engine engine;

    public Car(int weight, int price, String model, Engine engine) {
        super(weight);
        this.price = price;
        this.model = model;
        this.engine = engine;
    }
    //запись полей, стерезизованого и несериализованого класса
    private void WriteObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeInt(engine.power);
            oos.writeObject(engine.producer);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    //чтение полей, стерезизованого и несериализованого класса
    private void ReadObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            this.engine = new Engine(ois.readInt(), (String) ois.readObject());
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}

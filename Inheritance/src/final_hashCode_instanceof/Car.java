package final_hashCode_instanceof;

public class Car extends Transport {
    double volume;
    String model;
    public Car(String type, int size, double volume, String model) {
        super(type, size);
        this.volume = volume;
        this.model = model;
    }
}

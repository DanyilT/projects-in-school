package final_hashCode_instanceof;

public class Bus extends Transport {
    int passengers;
    String model;
    double price;
    public Bus(String type, int size, int passengers, String model, double price) {
        super(type, size);
        this.passengers = passengers;
        this.model = model;
        this.price = price;
    }
}
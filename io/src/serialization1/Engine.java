package serialization1;

import java.io.Serializable;

public class Engine {
    int power;
    String producer;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }
}

package serialization1;

import java.io.Serializable;

public class Mashine implements Serializable {
    int weight;

    public Mashine(int weight) {
        this.weight = weight;
    }
    Mashine(){}
}

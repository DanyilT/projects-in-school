package car;

public class Car {
    String model;
    int maxSpeed;
    boolean hasHatch;

    public Car(String model, int maxSpeed, boolean hasHatch) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.hasHatch = hasHatch;
    }
	Car(int maxSpeed) {
            this("Ferrari", maxSpeed, false);
    }
	Car(String model) {
            this(model, 250, false);
    }
	Car() {
            this("Ferrari", 250, false);
    }

    void displayInfo(){
        System.out.printf("Модель: %s \t макс. скорость: %d \t есть люк: %s \n", model, maxSpeed, hasHatch);
    }
}

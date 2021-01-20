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

    public String toString(){
        return "Модель: " + model + ", макс. скорость: " + maxSpeed + ", есть люк: " + (hasHatch?"есть":"нету");
    }
}

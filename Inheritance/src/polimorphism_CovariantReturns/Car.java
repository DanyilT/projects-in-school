package polimorphism_CovariantReturns;

public class Car extends Transport {
    double volume;
    String model;
    public Car(String type, int size, double volume, String model) {
        super(type, size);
        this.volume = volume;
        this.model = model;
    }
    public Car(double volume, String model) {
        super("electric",2);
        this.volume = volume;
        this.model = model;
    }
    //"Сырые" методы-"генераторы" (требуют кастинга, ведь возвращают родительский клас)
    public static Transport x(){
        return new Car(3,"Tesla");
    }
    public static Transport x(double volume, String model){
        return new Car("electric", 1, volume, model);
    }
    public static Transport x(String type, int size, double volume, String model){
        return new Car(type, size, volume, model);
    }
    @Override
    public String getType(){
        return this.type;
    }
    @Override
    public int getSize() {
        return this.size;
    }
}

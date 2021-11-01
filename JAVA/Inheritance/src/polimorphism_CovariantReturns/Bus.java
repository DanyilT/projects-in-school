package polimorphism_CovariantReturns;

public class Bus extends Transport {
    int passengers;
    String model;
    double price;
    public Bus(String type,int size, int passengers, String model, double price) {
        super(type, size);
        this.passengers = passengers;
        this.model = model;
        this.price = price;
    }
    public Bus(int passengers, String model, double price) {
        super("minibus", 4);
        this.passengers = passengers;
        this.model = model;
        this.price = price;
    }
    //Методы-"генераторы" (не требуют кастинга, возвращают инстанцию своего класса).
    public static Bus x(){
        return new Bus(8,"Mercedes-benz",0);
    }
    public static Bus x(int passengers, String model, double price){
        return new Bus("bigbus", 7, passengers, model, price);
    }
    public static Bus x(String type, int size, int passengers, String model, double price){
        return new Bus(type, size, passengers, model, price);
    }
    @Override
    public String getType(){
        return this.type;
    } @Override
    public int getSize(){
        return this.size;
    }
}

package polimorphism_CovariantReturns;

public class Transport {
    String type;
    int size;
    public Transport(String type, int size) {
        this.type = type;
        this.size = size;
    }
     //Методы-"генераторы"
    public static Transport x(){
        return new Transport("mini",3);
    }
    public static Transport x(String type, int size){
        return new Transport(type, size);
    }
    //Эти методы будут перезаписываться в наследниках (Полиморфизм)
    public String getType(){
        return this.type;
    } public int getSize(){
        return this.size;
    }
}

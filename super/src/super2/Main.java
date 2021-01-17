package super2;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(3, "Husky", 50, "Pysu");
        System.out.println(d.getWeight() + " " + d.getBreed() + " " + d.price + " " + d.name);
    }

//пустой клас
class Empty{
        Empty(){
            super();
        }
    }
}
package polimorphism;

public class Main {
    public static void main(String[] args) {
        //Swallow s = new Swallow();
        Bird swallow = new Swallow(); //первый принцип полиморфизма
        Bird strauss = new Strauss();
        Bird penguin = new Penguin();
        Bird [] birds = {swallow, strauss, penguin};
        for (Bird temp : birds){
            temp.move();
        }
    }
}
class Bird{
    void move(){
        System.out.println("Moves");
    }
}
class Swallow extends Bird {
    void move(){
        System.out.println("Fly");
    }
}
class Strauss extends Bird {
    void move(){
        System.out.println("Run");
    }
}
class Penguin extends Bird {
    void move(){
        System.out.println("Swim");
    }
}
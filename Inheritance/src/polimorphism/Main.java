package polimorphism;

public class Main {
    public static void main(String[] args) {
        //Swallow s = new Swallow();
        Bird swallow = new Swallow(); //первый тип полиморфизма
        Bird strauss = new Strauss();
        Bird penguin = new Penguin();
        Bird crokozablik = new Crokozablik();
        Bird [] birds = {swallow, strauss, penguin, crokozablik};
        for (Bird temp : birds){ //второй тип полиморфизма
            polyMoves(temp);
        }
        Penguin p1 = new Penguin();
        p1.move();
    }
        static void polyMoves(Bird bird){
            bird.move();
    }
        Swallow creator = new Swallow();
        Swallow s1 = creator.createBird();
        Swallow s2 = (Swallow)creator.createBird();
        Swallow [] sw = {s1, s2};
    }
class Bird{
    void move(){
        System.out.println("Moves");
    }
    Bird createBird(){
        return new Bird();
    }
}
class Swallow extends Bird {
    void move(){
        System.out.println("Fly");
    }
    //Bird createBird() { //третий тип полиморфизма
        //return new Swallow();
    Swallow createBird(){
        return new Swallow();
    }
}
class Strauss extends Bird {
    void move(){
        System.out.println("Run");
    }
    Bird createBird() {
        return new Strauss();
    }
}
class Penguin extends Bird {
    void move(){
        System.out.println("Swim");
    }
    Bird createBird() {
        return new Penguin();
    }
}
class Crokozablik extends Bird {
    void move(){
        System.out.println("crawl");
    }
    Bird createBird() {
        return new Crokozablik();
    }
}

//Covariant Return - Ковариантный Возврат
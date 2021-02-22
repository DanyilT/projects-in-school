package lesson95;

public class Cat {
    int weight;
    static int legs = 4;

    void getWeight(){
        Head h = new Head();
        h.display();

    }
    static class Body{
        void changeLegs(){
            Cat.legs = 5;
        }
    }
    void changeWeight(){
        Cat temp = new Cat();
        temp.weight = 4;
    }
 class Head{
        int size;
        void display(){
           System.out.println(Cat.this.weight);
       }
    }
}

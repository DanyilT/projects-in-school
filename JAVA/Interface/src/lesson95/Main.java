package lesson95;

public class Main {
    public static void main(String[] args) {
        //inner (nested) outer
        // static inner
        //inner class
        //local inner class
        //anonymous inner class
        Cat myCat =new Cat();

        myCat.weight = 5;
        Cat.legs = 3;

        //Body.legs //compile error
        Cat.Body catBody = new Cat.Body();

        catBody.changeLegs();
        System.out.println(Cat.legs);

        Cat.Head catHead = new Cat().new Head();
        Cat.Head catHead2 = myCat.new Head();

        myCat.getWeight();
    }
}

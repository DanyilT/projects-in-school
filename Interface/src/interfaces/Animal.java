package interfaces;

public abstract class Animal implements Lifeable {
    abstract void say();
    public void live(){
        System.out.println("From mother to father");
    }
}

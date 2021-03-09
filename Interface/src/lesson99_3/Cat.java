package lesson99_3;

public class Cat extends Animal{
    @Override
    void process(){
        super.process();
        System.out.println("I'm Cat...");
    }
    Pet WhoAreYou(){
        return new Pet(){
            @Override
            void process(){
                super.process();
                System.out.println("I'm Cat...");
            }
        };
    }
}

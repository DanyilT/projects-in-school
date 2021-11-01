package lesson98;

public class Mobile extends Computer {
    @Override
    void process(){
        super.process();
        System.out.println("Mobile process...");
    }
    Phone makePhone(){
        return new Phone(){
            @Override
          void process(){
              super.process();
              System.out.println("Mobile process.......");
          }
        };
    }
}
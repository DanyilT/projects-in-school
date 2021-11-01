package lesson98;

public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.process();

        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        Computer[] c = {c1, c2, m1};
        Phone[] p = {p1, p2, m2.makePhone()};

        for(Computer temp : c){
            temp.process();
        }
        for(Phone temp : p){
            temp.process();
        }
    }
}

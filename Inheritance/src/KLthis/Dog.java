package KLthis;

public class Dog {
    String brade;
    String name;
    int age;

    Dog(String name){
        this.name = name;
    }

    Dog(String b, String n, int a){
        this.brade = b;
        this.name = n;
        this.age = a;
    }
    public String toString() {
        return this.brade + " " + this.age;
    }
        public boolean equals(Object o){
        boolean result = this.age == ((Dog)o).age &&
                this.brade.equals(((Dog)o).brade) &&
                this.name.equals(((Dog)o).name);
        return result;
    }
}

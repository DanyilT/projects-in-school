package personal;

public class Main {
    public static void main(String[] args) {
        Person under = new Person();
        under.displayInfo();

        Person Tom = new Person("Tom");
        Tom.displayInfo();

        Person Mari = new Person("Mari", 21);
        Mari.displayInfo();
    }
}

package personal;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(){
        this("Undefined", 18);
    }

    Person(String name) {
        this(name, 29);
    }
    void displayInfo(){
        System.out.printf("Name: %s \t Age: %d \n", name, age);
    }
}

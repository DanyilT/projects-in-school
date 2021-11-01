package hash_code2;

//import finals.Animal;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.hashCode());
        a.age = 3;
        a.name = "Pusya";
        System.out.println(a.hashCode());
    }
}

package KLthis;

public class Main {
    public static void main(String[] args) {
        String s = "Dany";
        String s1 = new String("Dany");
        String s2 = new String("Lera");
        Dog d1 = new Dog("Husky","Mosy",4);
        Dog d2 = new Dog("Husky","Mosy",4);
        Dog d3 = new Dog("Dog","Pusy",2);
        System.out.println(s);
        System.out.println(s.equals(s1)); //true
        System.out.println(s.equals(s2)); //false
        System.out.println(d1);
        System.out.println(d1.equals(d2)); //true
        System.out.println(d1.equals(d3)); //false
    }
}

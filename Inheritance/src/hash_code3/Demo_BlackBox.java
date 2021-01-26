package hash_code3;

public class Demo_BlackBox {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);
        System.out.println(object1.equals(object2));
        System.out.println(object1.hashCode() == object2.hashCode());
    }
}

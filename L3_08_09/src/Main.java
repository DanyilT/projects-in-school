public class Main {

    public static void main(String[] args) {
        int a = 1257;
        int b = 24;
        int c = a/b;
        System.out.println("Всего карандашей = " + a);
        System.out.println("В коробку помещаются " + b + " карандаша");
        System.out.println("Количество коробок = " + c + ", и одна не полная коробка");
        System.out.println("Всего коробок = " + (c + 1));
    }
}

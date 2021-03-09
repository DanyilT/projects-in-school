package exception5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Берётся рандомное число и умножается на 3, если число равно 0 то выводит Exception3, если число равно 1 то выводит Exception2, если число равно 2 то выводит Exception1");
        try {
            method1();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void method1() throws Exception1, Exception2, Exception3{
        int i = (int) (Math.random() * 3);
        if (i == 0) throw new Exception3();
        if (i == 1) {
            throw new Exception2();
        }
        if (i == 2)throw new Exception1();
    }
}
class Exception1 extends  Exception {}
class Exception2 extends  Exception1 {}
class Exception3 extends  Exception2 {}

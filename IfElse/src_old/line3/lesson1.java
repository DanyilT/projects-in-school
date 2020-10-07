package line3;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Найти x");
        System.out.println("Получилось число 546");
        System.out.println("x2 = среднее число которое поставили на первое место");
        System.out.println("x1 = число которое стояло первым, но стало вторым");
        System.out.println("x3 = последнее число");
        int x1 = 546/10%10;
        int x2 = 546/100;
        int x3 = 546%10;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.print("x = ");
        System.out.println(x1*100 + x2*10 + x3);
    }
}

package lesson2;

        import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите 2 чила");
        int a = s.nextInt();
        int b = s.nextInt();
        Boolean d = a>b;
        System.out.println(d);
    }
}

package line3;
import java.util.Scanner;

public class lesson1 {
    static Scanner x = new Scanner(System. in);

    public static void main(String[] args) {
        int m = 546;
        int a = m/100; //5
        int b = m/10; //6
        int c = m/ 10%10;//4
        int d = a*100+b+c*10;
        System.out.println(d);
    }
}
package exception1;

public class Main {
    public static void main(String[] args) {
        int x = 30;
        int y = 0;
        int[] z = {1, 2, 3};
        try {
            display(z);
            divide(x, y);
        } catch (RuntimeException re) {
            System.out.println("Catch inside main");
            System.out.println(re);
        }finally {
            System.out.println("Закончилась проверка масива");
        }
    }
    static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }finally {
            System.out.println("Close divide");
        }
    }
    static void display(int [] q){
        try {
            System.out.println(q[3]);
        }finally {
            System.out.println("Close divide");
        }
    }
}

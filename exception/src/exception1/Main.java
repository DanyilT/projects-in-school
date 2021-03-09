package exception1;

public class Main {
    public static void main(String[] args) {
        int x = 30;
        int y = 0;
        int[] z = {1, 2, 3};
        divide(x, y);
        try {
            display(z);
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println(aie);
        }
    }
    static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }
    static void display(int [] q){
        System.out.println(q[3]);
    }
}

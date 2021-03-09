package lesson101;

public class Main3 {
    public static void main(String[] args) {
        int x = 6;
        int y = 0;
        int[] numbers = {1, 4, -7, 2};
        String data = null;
        try {
            System.out.println(data.length());
            System.out.println(x / y);
            System.out.println(numbers[10]);
        }catch (ArithmeticException ae){
            System.out.println("divide be 0");
        }catch (RuntimeException re){
            System.out.println("all runtime exception");
        }
    }
}

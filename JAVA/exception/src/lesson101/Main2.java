package lesson101;

public class Main2 {
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
            System.out.println("Divide by 0");
        }catch (ArrayIndexOutOfBoundsException aio){
            System.out.println("Index out of bounds");
        }catch (NullPointerException npe){
            System.out.println("data is null");
        }
        System.out.println("END program");
    }
}

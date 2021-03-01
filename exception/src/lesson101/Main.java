package lesson101;

public class Main {
    public static void main(String[] args) {
        //Throwable
        //Exception
        //Error
        //IOException, SQLException. RunTimeException
        System.out.println("START program");
        int x = 6;
        int y = 0;
        try {
            System.out.println("BEGIN try");
            System.out.println(x / y);
            System.out.println("END try");
        }catch (ArithmeticException ae){
            System.out.println("Деление на 0");
        }
        System.out.println("END program");

        System.out.println("----------------------");

        int[] numbers = {1, 4, -7, 2};
        try {
            System.out.println("BEGIN try");
            System.out.println(numbers[10]);
            System.out.println("END try");
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Нету 10-ого елемента");
        }
    }
}

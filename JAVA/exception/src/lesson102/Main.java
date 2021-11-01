package lesson102;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //try, catch, finally, throw, throws
        //try + catch
        //try + finally
        //try + catch + finally

        int x = 0, index = 0, y = 1;
        int[] z = new int[10]; //0..9
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("Insert number 1, 2 or 3");
            try {
                x = s.nextInt();
            }catch (InputMismatchException ime){
                System.out.println("Whore data type");
                s.next();
                continue;
            }
            if (x == 1){
                index = 25;
                break;
            }else if (x == 2){
                y = 0;
            }else if (x == 3){
                break;
            }else {
                System.out.println("Wrong number");
            }
        }
        try {
            z[index] = 100;
            x = 10 / y;
            System.out.println("NO Problem, finish without exception");
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception type - " + e);
        }finally{
            System.out.println("Finish Scanner");
            s.close();
        }
    }
}

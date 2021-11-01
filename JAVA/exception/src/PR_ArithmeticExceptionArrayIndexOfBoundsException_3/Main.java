package PR_ArithmeticExceptionArrayIndexOfBoundsException_3;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int[] m = {-1, 0, 1};
        try {
            int a = s.nextInt();
            m[a] = 4/a;
            System.out.println(m[a]);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}

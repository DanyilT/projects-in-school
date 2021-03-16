package PR_ArithmeticExceptionArrayIndexOfBoundsException_2;

public class Dispatcher {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int[] a = {2, 7, 5};
        System.out.println("Start");
        try {
            System.out.println(x/y);
            //Из-за ошибки, это не будет выведено
            System.out.println("After divided");
            System.out.println(a[2]);
            System.out.println("After arrays element");
        } catch(ArithmeticException ae){
            System.out.println("In catch");
            System.out.println(ae);
            System.out.println("In catch divided");
        } finally {
            System.out.println("Finally");
            System.out.println("End");
        }
    }
}

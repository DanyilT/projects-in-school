package PR_ArithmeticExceptionArrayIndexOfBoundsException_1;

public class SimpleExt {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println("10 / n = " + (10 / n));
        } catch(ArithmeticException e){
            System.out.println("Division by 0");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No number");
        } catch(NumberFormatException e){
            System.out.println("Not number");
        }
        System.out.println("After all actions");
    }
}

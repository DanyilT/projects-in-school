package PR_ArithmeticExceptionArrayIndexOfBoundsException_1;

public class SimpleExt {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println("10/n = "+(10/n));
        } catch(ArithmeticException e){
            System.out.println("Деление на 0");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Не введено число");
        } catch(NumberFormatException e){
            System.out.println("Не число");
        }
        System.out.println("After all actions");
    }
}

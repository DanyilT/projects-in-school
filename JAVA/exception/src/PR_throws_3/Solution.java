package PR_throws_3;

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }
    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (Exception e){
            Solution.printStack(e);
        }
    }
    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for(StackTraceElement e : throwable.getStackTrace()) System.err.println("\t" + e);
    }
    public void method1(){
        throw new NullPointerException();
    }
    public void method2() {
        throw new ArithmeticException();
    }
    public void method3() {
        throw new ArrayIndexOutOfBoundsException();
    }
    public void method4() {
        throw new ClassCastException();
    }
}

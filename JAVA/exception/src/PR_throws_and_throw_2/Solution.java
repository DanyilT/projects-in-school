package PR_throws_and_throw_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }
    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
    public void method1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    public void method2() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
    public void method3() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
}

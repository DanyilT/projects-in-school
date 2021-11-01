package PR_throws_and_throw_1;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.HashMap;

public class Solution{
    public static void main(String[] args) throws ArithmeticException, URISyntaxException {
        try {
            method1();
        } catch (NullPointerException | FileNotFoundException npeffe) {
            System.out.println(npeffe.getClass().getSimpleName());
        }
    }
    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) throw new NullPointerException();
        if (i == 1) throw new ArithmeticException();
        if (i == 2) throw new FileNotFoundException();
        if (i == 3) throw new URISyntaxException("undefined", "null");
    }
}

package pr_04_;

import java.util.Arrays;

public class Main {
    public static void varargs(String x, int ... numbers) {
        if (numbers.length == 0) {
            System.out.println(x);
        } else {
            System.out.println(x + Arrays.toString(numbers));
        }
    }
    public static void main(String[] args) {
        varargs("Dany");
        varargs("Java ", 1);
        varargs("I ", new int[]{8, 13});
    }
}

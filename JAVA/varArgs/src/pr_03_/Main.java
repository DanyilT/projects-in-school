package pr_03_;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {1, 2};
        int[][] aa = { {11, 22}, {33, 44} };
        int[][] bb = { {11, 22}, {33, 44} };

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.deepEquals(aa, bb));

        System.out.println();

        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((x[i] = (int) (Math.random() * 100)) + " ");
        }
        System.out.println();

        Arrays.sort(x);
        for (int i = 0; i < 10; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        int temp = 8;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == temp) {
                System.out.println("Number = " + temp + "; index = " + i);
            }
        }
    }
}

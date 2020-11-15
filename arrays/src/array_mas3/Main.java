package array_mas3;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                a[i][j] = (int) Math.random() * 100;
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++)
                    a[i][j] = i - j;

        }
    }
}

package array_mas6;

public class Main {
    public static void main(String[] args) {
         int f;
         int n = 5;
         int[][] a = new int[n][n];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = (int) Math.random() * 100;
         }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                f = a[i][j];
            }
        }
    }
}
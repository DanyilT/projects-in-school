package array_mas1;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i - j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

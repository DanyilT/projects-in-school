package array_mas10;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 40);
            }
        }
        double[] s = new double[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j : a[i]) {
                sum += j;
                s[i] = sum / 10;
            }
        }
        System.out.println("Первый масив");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Второй масив среднего числа");
        for(int i = 0; i < n; i++) {
                System.out.println(s[i] + " ");
        }
    }
}

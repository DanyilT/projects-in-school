package array_mas7;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0 ^ j%2==0){
                    a[i][j] = 0;
                }else {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

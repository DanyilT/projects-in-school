package array_mas11;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        int[][] a1 = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) a1[i][j] = (int)(Math.random() * 25) + 5;
        }
        int[][] a2 = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a2[j][i] = a1[i][j];
            }
        }
        System.out.println("Первый масив");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Второй масив");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

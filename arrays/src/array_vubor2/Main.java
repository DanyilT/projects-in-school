package array_vubor2;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int[] arr1 = new int[30];
        for (int i = 0; i < 20; i++) {
            arr1[i] = (int) Math.floor(Math.random() * 160) - 70;
        }
        double sr;
        int s = 0;
        for (int i = 0; i < 20; i++) {
            s = s + arr1[i];
        }
        sr = s/20;
        for (int i = 0; i < 20; i++) {
            if (arr1[i] > sr) {
                n++;
            }
        }
            int j = 0;
        int[]arr2 = new int[n];
        for (int i = 0; i < 20; i++) {
            if (arr1[i] > sr) {
                arr2[j] = arr1[i];
                j++;
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i] + " ");
        }
    }
}
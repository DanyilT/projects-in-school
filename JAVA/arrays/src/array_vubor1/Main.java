package array_vubor1;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int[] arr1 = new int[30];
        for (int i = 0; i < 30; i++) {                              //[-100;100]
            arr1[i] = (int) Math.floor(Math.random() * 200) - 100; //(.....()'100 - (- 100)') - 100
            }
        for (int i = 0; i < 30; i++) {
            if (arr1[i] > 0) n++;
        }
        int j = 0;
        int[]arr2 = new int[n];
        for (int i = 0; i < 30; i++) {
            if (arr1[i] > 0){
                arr2[j] = arr1[i];
                j++;
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i] + " ");
        }
    }
}
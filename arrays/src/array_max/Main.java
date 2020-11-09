package array_max;

public class Main {
    public static void main(String[] args) {
    int n = 15;
    int[] arr1;
    arr1 = new int[n];
    for (int i = 0; i < n; i++) {
        arr1[i] = (int) Math.floor(Math.random() * 32) + 154;
    }
    int max = 154;
    int min = 186;
    int nmax = 0;
    int nmin = 0;
    for (int i = 0; i < n; i++) {
        if (arr1[i] <= min) {
            min = arr1[i];
            nmin = i;
        }
        if (arr1[i] >= max) {
            max = arr1[i];
            nmax = i;
        }
        System.out.println(arr1[i]);
    }
    System.out.println("Самый низкий " + min + "; В списке под номеом " + nmin);
    System.out.println("Самый высокий " + max + "; В списке под номеом " + nmax);
        int a = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите " + (i+1) + " число");
            a+=arr1[i];
        }
        System.out.println("Сумма 15 чисел = " + a);
        double y =a/15;
        System.out.println("Среднее 10 чисел = " + y);
    }
}
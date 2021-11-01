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
    int sum = 0;
    for (int i = 0; i < n; i++) {
        if (arr1[i] <= min) {
            min = arr1[i];
            nmin = i;
        }
        if (arr1[i] >= max) {
            max = arr1[i];
            nmax = i;
        }
    }
        for (int i = 0; i < 10; i++) {
            sum = arr1[i] + sum;
        }
        double y =sum/15;

    System.out.println("Самый низкий " + min + "; В списке под номеом " + nmin);
    System.out.println("Самый высокий " + max + "; В списке под номеом " + nmax);

        System.out.println("Сумма 15 чисел = " + sum);
        System.out.println("Среднее 15 чисел = " + y);
    }
}
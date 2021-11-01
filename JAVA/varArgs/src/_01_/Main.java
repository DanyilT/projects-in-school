package _01_;

public class Main {
    int sumArrays(int [] ... intAr) {
        int sum, i, j;
        sum = 0;
        for (i = 0; i < intAr.length; i++) {
            for (j = 0; j < intAr[i].length; j++) {
                sum += intAr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int sum = 0;
        sum = main.sumArrays(new int[]{3, 6, 2},
                new int[]{5, 5, 5,},
                new int[]{8, 2, 13});

        System.out.println("Sum = " + sum);
    }
}

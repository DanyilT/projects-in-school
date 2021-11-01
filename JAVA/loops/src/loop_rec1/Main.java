package loop_rec1;

public class Main {
    public static String recorsion(int n){
        if (n==1){
            return "1";
        }
        return n + " " + recorsion(n-1);
    }
    public static int fact(int a) {
        if (a == 1) {
            return 1;
        }
        return a * fact(a - 1);
    }
    public static void main(String[] args) {
        System.out.println("Ввод чисел методом рекурсии");
        System.out.println(recorsion(12));
        System.out.println("Вычисление фактариала методом рекурсии");
        System.out.println(fact(9));
    }
}

package loop_vl;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
    }
}

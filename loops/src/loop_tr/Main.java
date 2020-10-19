package loop_tr;

public class Main {
    public static void main(String[] args) {
        //Мой вариант
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Первый треугольник 10-1");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Второй треугольник 1-10");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Треугольник (3)");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Треугольник (1)");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Треугольник (2)");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Треугольник (4)");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Треугольник (5)");
        //дорешаьть
    }
}

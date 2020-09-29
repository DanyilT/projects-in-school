public class Main {

    public static void main(String[] args) {
        String a ="Hello";
        System.out.println("Переменная типа текст(String) " + a);

        byte B = 8;
        System.out.println("Переменная типа числа(byte) " + B);

        short s = 16;
        System.out.println("Переменная типа числа(schort) " +s);

        int i = 32;
        System.out.println("Переменная типа числа(int) " + i);

        long l = 64;
        System.out.println("Переменная типа числа(long) " + l);

        double d = 64.0;
        System.out.println("Переменная дробных чисел(double)" + d);

        float f = 32;
        System.out.println("Переменная дробных чисел(float) " + f);

        char  c ='1';
        System.out.println("Переменная типа одного символа(char) " + c);

        boolean b = true;
        System.out.println("Логическая переменная(boolean) " + b);

        //increment
        int a1 = 1;
        int b1 = a1++;
        int c1 = ++a1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        //decrement
        int a2 = 1;
        int b2 = a2--;
        int c2 = --a2;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
    }
}

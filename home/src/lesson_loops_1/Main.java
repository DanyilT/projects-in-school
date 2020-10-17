package lesson_loops_1;     //DZ1_loops1  //№4-Г(Циклічне виведення числових послідовностей в прямому, зворотньому порядках»)

public class Main {
    public static void main(String[] args) {
        double a1 = 0.5;
        double a2 = 0.8;
        for (int n = 16; n < 25; n++){
            System.out.print(n + " ");
            System.out.print(n - a1 + " ");
            System.out.println(n + a2);
        }
    }
}

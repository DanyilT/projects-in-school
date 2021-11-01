package lesson_loops_2;     //DZ1_loops1  //№5(Циклічне виведення числових послідовностей в прямому, зворотньому порядках»)

public class Main {
    public static void main(String[] args) {
        double a = 20.4;
        System.out.println("Стоимость = " + a);
        System.out.println(" ");
        for (int n = 2; n <= 20; n++){
            System.out.println("Стоимость " + n + " товара = " + a*n);
        }
    }
}

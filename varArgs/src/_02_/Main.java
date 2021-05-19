package _02_;

public class Main {
    static void display(String ... its) {
        System.out.println("Java go");
        for (String s : its) {
            System.out.println(s +  " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        display();
        display("Dany", "Dimtro", "Natasha", "Lera", "Nastya", "Misha", "Kate", "Nira");
        display("D.T");
    }
}

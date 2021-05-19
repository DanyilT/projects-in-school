package _03_;

public class Main {
    static void display(int num, String ... its) {
        System.out.print("Number = " + num);
        for (String s : its) {
            System.out.print(s +  " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    display(300, " - hello");
    display(999, " - My", " name", " is", " Dany");
    }
}

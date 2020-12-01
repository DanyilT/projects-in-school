package string_m;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String a = "JAVA FOREVER";
        int index0 = a.indexOf('S');
        System.out.println(index0);
        int index1 = a.indexOf('A');
        System.out.println(index1);
        int index2 = a.indexOf('A', 2);
        System.out.println(index2);
        int index3 = a.indexOf("FOR");
        System.out.println(index3);
        System.out.println();
//дз(начало)
        String d = "I am person, human/Я человек, и всё; больше ничего не придумал";
        System.out.print("Введите, то что хотите найти = ");
        String x = s.nextLine();
        for(int i = 0; i < d.length(); i++){
            int index = d.indexOf(x, i);
            if(index == -1){
                System.out.println("Больше совпадений не найдено");
                break;
            }
        System.out.println(index);
        i = index;
        }
//дз(конец)
        System.out.println();

        int aa = 40, bb = 34;
        double cc = 56.5, dd = 7.2;
        change(aa,bb);
        change(cc,dd);
        change(aa, bb);
        change(aa, cc);
        change(dd, bb);
    }
    static void change(int x, int y){
            System.out.println(x + y);
    }
    static void change(double x, double y){
        System.out.println(x - y);
    }
    static void change(double x, int y){
        System.out.println(x - y);
    }
    static void change(int x, double y){
        System.out.println(x - y);
    }
}

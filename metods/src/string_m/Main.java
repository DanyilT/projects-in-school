package string_m;

public class Main {
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
        String d = "I am person, human";
        int index01 = d.indexOf('I');
        System.out.println(index01);
        int index02 = d.indexOf("am");
        System.out.println(index02);
        int index03 = d.indexOf('p');
        System.out.println(index03);
        int index04 = d.indexOf('n', 1);
        System.out.println(index04);
        int index05 = d.indexOf('a', 2);
        System.out.println(index05);
        int index06 = d.indexOf("man");
        System.out.println(index06);

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

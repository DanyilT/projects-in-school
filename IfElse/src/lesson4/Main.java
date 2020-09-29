package lesson4;

public class Main {
    public static void main(String[] args) {
        Boolean a = true;
        Boolean b = false;
        Boolean c = false;
        Boolean d1 = a | b;
        Boolean d2 = b & c;
        Boolean d3 = b | c;
        System.out.println(d1 + " " + d2 + " " + d3);
    }
}

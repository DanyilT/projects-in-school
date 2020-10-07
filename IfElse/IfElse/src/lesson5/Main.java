package lesson5;

public class Main {
    public static void main(String[] args) {
        Boolean x = false;
        Boolean y = false;
        Boolean z = true;
        Boolean a = x | y & !z;     //а
        Boolean b = !x & !y | z;    //в
        Boolean d = x & !y | !z;    //д
        System.out.println(a + " " + b + " " + d);
    }
}

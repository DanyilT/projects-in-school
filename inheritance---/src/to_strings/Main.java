package to_strings;

public class Main {
    public static void main(String[] args) {
        String s = new String("Dany");
        String s1 = new String("Dany");
        String s2 = new String("Artem");
        System.out.println(s == s1); //false
        System.out.println(s == s2); //false
        System.out.println(s.equals(s1)); //true
        System.out.println(s.equals(s2)); //false
        int a = 6;
        int b = 9;
        int c = 3;
        System.out.println(a == b); //false
        System.out.println((b - a) == c); //true
    }
}

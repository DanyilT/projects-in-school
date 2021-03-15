package hello;

public class Main {
    public static void main(String[] args) {
        String d = "Dany";
        String h = "Hacker";
        String p = "Programmer";

        System.out.println("Hello World");
        System.out.println("Who I?");
        System.out.println("I'm Dany");

        String dh = "Dany it's Hacker";
        System.out.print(dh + " - ");
        System.out.println(d == h);

        d = p;
        String dp = "Dany it's Programmer";
        System.out.print(dp + " - ");
        System.out.println(d == p);
    }
}

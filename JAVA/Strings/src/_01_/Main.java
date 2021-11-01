package _01_;

public class Main {
    public static void main(String[] args) {
        String string1 = "First line";
        String string2 = "Second line";
        String string3 = "Third line";

        System.out.println("\t Length line \"string1\" = " + string1.length());
        System.out.println("\t Symbol with index '3' in line = " + string1.charAt(3));

        if (string1.equals(string2)) {
            System.out.println("1");
            System.out.println(string1 == string2);
        } else {
            System.out.println("2");
            System.out.println(string1 != string2);
        }
        if (string1.equals(string3)) {
            System.out.println("3");
            System.out.println(string1 == string3);
        } else {
            System.out.println("4");
            System.out.println(string1 != string3);
        }
    }
}

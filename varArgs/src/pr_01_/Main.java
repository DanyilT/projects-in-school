package pr_01_;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("test");

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("test");

        System.out.println(stringBuilder1.toString().equals(stringBuilder2.toString()));
    }
}

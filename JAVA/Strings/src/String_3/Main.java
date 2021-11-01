package String_3;

public class Main {
    public static void main(String[] args) {
        StringBuffer superprakticheskazpostringamnomer3 = new StringBuffer();
        superprakticheskazpostringamnomer3.append("Это супер переменная которая в практичкеской номер 3");

        System.out.println("\t Line = " + superprakticheskazpostringamnomer3);
        System.out.println("\t Length = " + superprakticheskazpostringamnomer3.length());
        System.out.println("\t Size = " + superprakticheskazpostringamnomer3.capacity());
        System.out.println("\t Symbol with index '8' in line = " + superprakticheskazpostringamnomer3.charAt(8));
        System.out.println("\t The words in high letters = " + superprakticheskazpostringamnomer3.toString().toUpperCase());
        System.out.println("\t Index later \"р\" = " + superprakticheskazpostringamnomer3.indexOf("р"));
        System.out.println("\t Delete word \"Это\" = " + superprakticheskazpostringamnomer3.delete(0,3));
        System.out.println("\t Reverse = " + superprakticheskazpostringamnomer3.reverse());
    }
}

package lesson95;

public class Main2 {
    public static void main(String[] args) {
        Book myBook = new Book (
                "Javascript для детей",
                "Shildt",
                2017,
                "O'Really");

        System.out.println(myBook.publisher.name);
        System.out.println(myBook);
        System.out.println(myBook.publisher.book);
    }
}

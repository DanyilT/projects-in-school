package lesson95;

public class Book {
    String name;
    String author;
    int year;
    public Publisher publisher;

    public Book(String name, String author, int year, String p) {
        this.name = name;
        this.author = author;
        this.year = year;
        publisher = new Publisher(p);
    }
    class Publisher {
        String name;
        Book book;

        public Publisher(String name) {
            this.name = name;
            book = Book.this;
        }
    }
}

package string_user;

public class User {
    String name;
    String surname;
    int birthYear;
    User(String a, String b, int c) {
        name = a;
        surname = b;
        birthYear = c;
    }
    int getAge() {
        return 2020 - birthYear;
    }
}
package string_user;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите имя, фамилию, дату рождения");
        User user1 = new User(s.nextLine(), s.nextLine(), s.nextInt());
        System.out.println(user1.name + " " + user1.surname + " " + user1.getAge() + " лет");
    }
}

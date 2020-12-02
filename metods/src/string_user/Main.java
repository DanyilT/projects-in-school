package string_user;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
System.out.println();//user1
        System.out.println("Введите имя, фамилию, дату рождения (user1)");
        User user1 = new User(s.nextLine(), s.nextLine(), s.nextInt());
        System.out.println(user1.name + " " + user1.surname + " - " + user1.getAge() + " лет");
System.out.println();//user2
        System.out.println("Введите рождения Тараса Шевченка (user2)");
        User user2 = new User("Тарас", "Шевченко", s.nextInt());
        System.out.println(user2.name + " " + user2.surname + " - " + user2.getAge() + " лет");
System.out.println();//user3
        System.out.println("(user3)");
        User user3 = new User("Даниил", "Тымчук", 2004);
        System.out.println(user3.name + " " + user3.surname + " - " + user3.getAge() + " лет");
    }
}

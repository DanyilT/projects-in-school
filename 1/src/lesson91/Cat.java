package lesson91;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cat: " + "name = " + name + ", age = " + age;
    }
    @Override
    public int compareTo(Cat o){
        return this.name.compareTo(o.name);
    }
}
class  SortByAge implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}
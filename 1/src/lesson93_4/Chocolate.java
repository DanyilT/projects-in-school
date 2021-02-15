package lesson93_4;

import lesson91.Cat;

import java.util.Comparator;

public class Chocolate implements Comparable<Chocolate> {
    String producer;
    int price;
    int weight;
    String name;

    public Chocolate(String producer, int price, int weight, String name) {
        this.producer = producer;
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chocolate: " + ", producer = " + producer + ", price = " + price + ", weight = " + weight + ", name = " + name;
    }

    @Override
    public int compareTo(Chocolate o) {

        return this.producer.compareTo(o.producer);
        //this.name.compareTo(o.name)
    }
}

class SortByPrice implements Comparator<Chocolate> {

    @Override
    public int compare(Chocolate o1, Chocolate o2) {
        return o1.price - o2.price;
    }
}

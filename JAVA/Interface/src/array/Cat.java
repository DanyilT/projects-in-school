package array;

public class Cat implements Comparable {
    String name;
    int price;
    String color;
    int age;

    public Cat(String name, int price, String color, int age) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.age = age;
    }
    @Override
    public String toString() {
        return name = "name = " + name + ", price = " + price + ", color = " + color + ", age = " + age;
    }
    @Override
    public int compareTo(Object o) {
        int rezult = this.price - ((Cat)o).price;
        if (rezult == 0){
            rezult = this.name.compareTo(((Cat)o).name);
        }
        if (rezult == 0){
            rezult = this.color.compareTo(((Cat)o).color);
        }
        if (rezult == 0){
            rezult = ((Integer)(this.age)).compareTo((Integer)((Cat)o).age);
        }
        return rezult;
    }
}

package lesson96;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car[] myCars = {
                new Car(350,300000,"White","Tesla"),
                new Car(500,1000000000,"Purple","Range Rover"),
                new Car(250,300000,"Black","Gelik")};
        Arrays.sort(myCars, new Car.ComparatorByColor());
        for (Car temp: myCars) {
            System.out.println(temp);
        }
        //new sorting by price
        Arrays.sort(myCars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        });   // Anonymous inner class end

        System.out.println("ТИИИИМЧИИИИИИИИИИИИКДДДДААААААААНЧИИИИК");//пробел

        for (Car temp: myCars) {
            System.out.println(temp);
        }
        //new sorting by speed
        Arrays.sort(myCars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.speed - o2.speed;
            }
        });
    }
}

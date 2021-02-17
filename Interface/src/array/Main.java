package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-2, 9, -5, 12, 1};
        Arrays.sort(numbers);

        for (int temp : numbers){
            System.out.println(temp + " ");
        }
        String[] names = {"Lesha", "Masha", "Emil", "iVan"};
        Arrays.sort(names);

        for (String temp : names){
            System.out.println(temp + " ");
        }
        Cat[] myCats = {new Cat("Pusy",100,"Red",3),
                new Cat("Murzik",99,"White",6),
                new Cat("Mufas",10000,"Orange",12)};
        Arrays.sort(myCats);
        System.out.println(myCats);
        for (Cat temp : myCats){
            System.out.println(temp + " ");
        }
        System.out.println("sort by price, after name, after color and after age");
    }
}

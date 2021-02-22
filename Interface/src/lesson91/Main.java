package lesson91;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] nummbers = {7, -3, 8, 1, -6};

        int index = Arrays.binarySearch(nummbers, 1);
        System.out.println(index);

        Arrays.sort(nummbers);
        for (int temp :nummbers) {
            System.out.println(temp + " ");
        }
        index = Arrays.binarySearch(nummbers, 1);
        System.out.println("\n" + index);

        ArrayList list = new ArrayList();
        list.add(6);
        list.add("Serg");
        list.add(new Cat ("Pusy", 3));

        for (Object object : list) {
            System.out.println(object.toString());
        }
        System.out.println(list);

        System.out.println(list.get(1));
        //Cat c = (Cat)list.get(1);
        //System.out.println(c);

        ArrayList<Cat> catList = new ArrayList<Cat>();
        //catList.add(8); errar
        catList.add(new Cat("Valera", 14));
        catList.add(new Cat("Muzik", 5));
        catList.add(new Cat("Simba", 3));
        catList.add(new Cat("BatCat", 18));

        System.out.println(catList);
        catList.remove(1);
        System.out.println(catList);


        Cat[] array = new Cat[catList.size()];
        catList.toArray(array); //
        for (Cat temp : array) {
            System.out.println(temp);
        }

        Arrays.sort(array);


        for(Cat temp : array){
            System.out.println(temp); //после сорнтировки
        }

        catList.add(new Cat ("Venya", 1));
        catList.sort(new SortByAge());
        System.out.println("-----------");
        System.out.println(catList);
    }
}

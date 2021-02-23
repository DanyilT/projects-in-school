package lesson93_4;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Chocolate> ChocolateList = new ArrayList<Chocolate>();
        ChocolateList.add(new Chocolate("Roshen",20,98,"Olenka"));
        ChocolateList.add(new Chocolate("Millennium",40,110,"Millennium"));
        ChocolateList.add(new Chocolate("Google",999999,9,"Dumb"));
        ChocolateList.add(new Chocolate("Batman",1000000,1000,"BatChocolate"));
        ChocolateList.add(new Chocolate("Vaniy",50,100,"Lesha"));
        ChocolateList.add(new Chocolate("Super",100,100,"OneHundred"));
        ChocolateList.add(new Chocolate("iVan",95,67,"MmmmmmX"));
        ChocolateList.add(new Chocolate("Good",300,99, "Uhy"));
        ChocolateList.add(new Chocolate("Batman",199,54,"Joker"));
        ChocolateList.add(new Chocolate("Good",300,99,"Pear"));

        Chocolate[] array = new Chocolate[ChocolateList.size()];
        ChocolateList.toArray(array);
        Arrays.sort(array);
        for(Chocolate temp : array){
            System.out.println(temp + " ");
        }
        System.out.println();
        System.out.println("sort by producer, after price, after weight and after name");

    }
}

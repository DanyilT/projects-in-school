package lesson93_4;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Chocolate> ChocolateList = new ArrayList<Chocolate>();
        ChocolateList.add(new Chocolate("Loxa",14,300,"Оленка"));
        ChocolateList.add(new Chocolate("Timchik",100000,67,"Милениум"));
        ChocolateList.add(new Chocolate("Simba",300,9876986,"king"));
        ChocolateList.add(new Chocolate("Batbed",188,344,"BatChocolate"));

        System.out.println(ChocolateList);
        ChocolateList.remove(1);
        System.out.println(ChocolateList);


        Chocolate[] array = new Chocolate[ChocolateList.size()];
        ChocolateList.toArray(array);
        for (Chocolate temp : array) {
            System.out.println(temp);
        }

        Arrays.sort(array);
        for(Chocolate temp : array){
            System.out.println(temp);
        }

        ChocolateList.add(new Chocolate ("Vanya",87686,66666,"Lexa"));
        ChocolateList.sort(new SortByPrice());
        System.out.println("-----------");
        System.out.println(ChocolateList);
    }
}

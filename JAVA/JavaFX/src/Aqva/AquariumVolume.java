package Aqva;

public class AquariumVolume {
    public static void main(String[] args) {

        Aquarium aquarium1 = new Aquarium(30, 40, 60);
        Aquarium aquarium2 = new Aquarium(35, 40, 55);
        Aquarium aquarium3 = new Aquarium(50, 40, 60);
        int NumberFish = 10; //количество рыбок
        double WaterVolume = 9; //норма воды на 1 рыбку
        double TotalWaterVolume = NumberFish * WaterVolume;

        double a1 = aquarium1.AquariumVolume();
        double a2 = aquarium2.AquariumVolume();
        double a3 = aquarium3.AquariumVolume();

        System.out.println("\s Volume 1 aquarium = " + a1 + " liters");
        System.out.println("\s Volume 2 aquarium = " + a2 + " liters");
        System.out.println("\s Volume 3 aquarium = " + a3 + " liters");
        System.out.println("\n Total water volume = " + TotalWaterVolume);

        System.out.println("\n \t Aquarium 1 - " + (a1 >= TotalWaterVolume ? "suitable" : "not suitable") +
                "\n \t Aquarium 2 - " + (a2 >= TotalWaterVolume ? "suitable" : "not suitable") +
                "\n \t Aquarium 3 - " + (a3 >= TotalWaterVolume ? "suitable" : "not suitable"));

    }
}

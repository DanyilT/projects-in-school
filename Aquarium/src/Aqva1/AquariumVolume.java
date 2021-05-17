package Aqva1;

public class AquariumVolume {
    public static void main(String[] args) {
        Aquarium aquarium1 = new Aquarium(30,40,60);
        Aquarium aquarium2 = new Aquarium(35,40,55);
        Aquarium aquarium3 = new Aquarium(50,40,60);

        int NumberFish = 10;
        double WaterVolume = 9;
        double TotalWaterVolume = NumberFish * WaterVolume;

        double a1 = aquarium1.AquariumVolume();
        double a2 = aquarium2.AquariumVolume();
        double a3 = aquarium3.AquariumVolume();

        System.out.println("\t Volume 1 aquarium = " + a1 + " liters");
        System.out.println("\t Volume 2 aquarium = " + a2 + " liters");
        System.out.println("\t Volume 3 aquarium = " + a3 + " liters");
        System.out.println("\n Total water volume = " + TotalWaterVolume);

        System.out.println("\n \t Aquarium 1 - " + (a1 >= TotalWaterVolume ? "suitable" : "not suitable") +
                "\n \t Aquarium 2 - " + (a2 >= TotalWaterVolume ? "suitable" : "not suitable") +
                "\n \t Aquarium 3 - " + (a3 >= TotalWaterVolume ? "suitable" : "not suitable"));

        /*if (a1 >= TotalWaterVolume) {
            System.out.println("suitable");
        } else {
            System.out.println("not suitable");
        }*/
    }
}

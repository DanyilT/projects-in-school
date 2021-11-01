package Aqva2;

import java.util.Scanner;

public class AquariumVolume {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("write length = ");
        int length = s.nextInt();
        System.out.print("write width = ");
        int width = s.nextInt();
        System.out.print("write height = ");
        int height = s.nextInt();
        Aquarium aquarium = new Aquarium(length, width, height);

        System.out.print("write number = ");
        int NumberFish = s.nextInt();
        double WaterVolume = 9;
        double TotalWaterVolume = NumberFish * WaterVolume;

        double a = aquarium.AquariumVolume();

        System.out.println("\t Volume aquarium = " + a + " liters");
        System.out.println("\t Total water volume = " + TotalWaterVolume + "liters");
        System.out.println("\t Aquarium - " + (a >= TotalWaterVolume ? "suitable" : "not suitable"));
    }
}
